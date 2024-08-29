public class Calculate {
    public static void main(String[] args) throws Exception {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        sum(x, y);
    }

    static void sum(int x, int y){
        System.out.println(x + y);
    }
}
