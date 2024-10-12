import java.util.Scanner;

public class PD1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value n (integer): ");
        int n = scanner.nextInt();

        for(int i = 1; i <= 100; i++) {
            if (i % n == 0) System.out.println(i);
        }
    }
}
