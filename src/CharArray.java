import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String inputText = scanner.nextLine().replace(" ", "");
        scanner.close();

        char[] charArray = inputText.toCharArray();
        for(char c : charArray) {
            System.out.println(c);
        }
    }
}
