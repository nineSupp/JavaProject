import java.util.Scanner;

public class numberFactors {
    public static int getNFac(int number) {
        int nFac = 1;
        for(int i = 2; i <= number; i++) {
            if (number % i == 0) {
                nFac = i;
                break;
            }
        }
        return nFac;
    }

    public static String catEven(int number) {
        if (number / 2 == 1) {
            return "2";
        }
        else {
            return "2 x ";
        }
    }

    public static String catOdd(int number, int nFac) {
        if (number % nFac == 0) {
            if (number / nFac == 1) {
                return Integer.toString(nFac);
            }
            else {
                return nFac + " x ";
            }
        }
        else {
            if (number == 1) {
                return "";
            }
            else {
                return Integer.toString(number);
            }
        }
    }

    public static StringBuilder buildString(int i, boolean isDivisible) {
        if (isDivisible) {
            return new StringBuilder(String.format("The factors of the number %d are: ", i));
        }

        return new StringBuilder(String.format("The factor of the number %d is: ", i));
    }

    public static void loopEachNum(int number) {
        StringBuilder displayFactor = new StringBuilder();
        boolean isDivisible = false;
        int count = 0;
        int holdNum = number;

        while(number != 0) {
            if (number == 1) {
                if (count > 1) {
                    isDivisible = true;
                }
                break;
            }
            else if (number % 2 != 0) {
                int nFac = getNFac(number);
                displayFactor.append(catOdd(number, nFac));
                number /= nFac;
                count++;
            }
            else {
                displayFactor.append(catEven(number));
                number /= 2;
                count++;
            }
        }

        StringBuilder display = buildString(holdNum, isDivisible);

        System.out.println(display.append(displayFactor));
    }

    public static void mainLoop(int range) {
        for(int i = 1; i <= range; i++) {
            if (i == 1) {
                System.out.println(buildString(i, false) + "1");
                continue;
            }
            loopEachNum(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you range for displaying factors: ");
        int range = scanner.nextInt();

        mainLoop(range);

        loopEachNum(12853);
    }
}



// Display 1 too.