public class Problem4 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        int[] count = new int[10]; 

        for (int i = 1; i <= 9; i++) {
            for (int n : nums) {
                if (n % i == 0) {
                    count[i]++;
                }
            }
        }

        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + count[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.print("}");
    }
}
