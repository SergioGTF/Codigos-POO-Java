public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 9, 5, 9, 5, 1, 1, 1 };
        int count = countBoomerangs(array);
        System.out.println("Número total de bumerangues: " + count);
    }

    public static int countBoomerangs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 2] && nums[i] != nums[i + 1]) {
                count++;
            }
        }

        return count;
    }
}
