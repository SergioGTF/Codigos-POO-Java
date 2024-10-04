import java.util.HashMap;
import java.util.Map;

public class PhoneConverter {
    private static final Map<Character, Character> phoneMap = new HashMap<>();

    static {
        phoneMap.put('A', '2'); phoneMap.put('B', '2'); phoneMap.put('C', '2');
        phoneMap.put('D', '3'); phoneMap.put('E', '3'); phoneMap.put('F', '3');
        phoneMap.put('G', '4'); phoneMap.put('H', '4'); phoneMap.put('I', '4');
        phoneMap.put('J', '5'); phoneMap.put('K', '5'); phoneMap.put('L', '5');
        phoneMap.put('M', '6'); phoneMap.put('N', '6'); phoneMap.put('O', '6');
        phoneMap.put('P', '7'); phoneMap.put('Q', '7'); phoneMap.put('R', '7'); phoneMap.put('S', '7');
        phoneMap.put('T', '8'); phoneMap.put('U', '8'); phoneMap.put('V', '8');
        phoneMap.put('W', '9'); phoneMap.put('X', '9'); phoneMap.put('Y', '9'); phoneMap.put('Z', '9');
    }

    public static String textToNum(String phone) {
        StringBuilder converted = new StringBuilder();
        for (char c : phone.toCharArray()) {
            if (phoneMap.containsKey(c)) {
                converted.append(phoneMap.get(c));
            } else {
                converted.append(c);
            }
        }
        return converted.toString();
    }

    public static void main(String[] args) {
        System.out.println(textToNum("1234-6475-EYES")); // "1234-6475-3937"
        System.out.println(textToNum("(91)4444-TEST"));  // "(91)4444-8378"
    }
}
