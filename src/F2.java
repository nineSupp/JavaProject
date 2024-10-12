import java.util.Scanner;

public class F2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input n (integer): ");
        int n = scanner.nextInt();

        int sumFac = 1;
        for(int i = 1; i <= n; i++) {
            sumFac *= i;
        }

        System.out.printf("The factorial of %d! is: %d", n, sumFac);
    }
}
