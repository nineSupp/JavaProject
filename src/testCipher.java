import java.util.Scanner;

public class testCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine().toLowerCase();
        System.out.print("Enter the n: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < -100 || n > 100)
            System.out.println("Invalid input for n.");
        long start = System.nanoTime();

        StringBuilder o = new StringBuilder();
        // a = 97, z = 122
        int diff = (n+(26*4))%26;

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' '){
                o.append(" ");
//                System.out.print(" ");
            }else if(c + diff > 'z'){
                o.append((char)(c + diff - 26));
//                System.out.print((char)(c + diff - 26));
            }else{
                o.append((char)(c + diff));
//                System.out.print((char)(c + diff));
            }

        }
        System.out.println(o);
        long end = System.nanoTime();
        System.out.println();       // 1519100, 771640
        System.out.println(end-start);
    }
}
