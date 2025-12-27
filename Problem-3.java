import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i += 2) {
            if (i == a && a % 2 == 0)
                break;

            System.out.print(i);
            if (i + 2 < a || (i + 2 == a && a % 2 != 0))
                System.out.print(", ");
        }

	}

}
