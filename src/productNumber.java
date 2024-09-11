public class productNumber {
    public static void main(String[] args) {
        int number = 200;

        for (int i = 1; i <= number; i++) {
            int getNumber = i;
            StringBuilder displayProduct = new StringBuilder(String.format("The factors of the number %d are: ", getNumber));
            if (getNumber == 1) {
                System.out.println("The factors of the number 1 is: 1");
                continue;
            }

            while(getNumber != 0) {
                // Dealing an odd factor. The lowest factor of odd number is 3.
                if (getNumber % 2 != 0) {
                    if (getNumber % 3 == 0) { // Fix here.
                        if (getNumber / 3 == 1) {               // This if is just to deal with pretty printing.
                            displayProduct.append("3");
                            break;
                        }
                        else {
                            displayProduct.append("3 x ");
                            getNumber /= 3;
                        }
                    }
                    else if (getNumber % 5 == 0) {
                        if (getNumber / 5 == 1) {           // This if is just to deal with pretty printing.
                            displayProduct.append("5");
                            break;
                        }
                        else {
                            displayProduct.append("5 x ");
                            getNumber /= 5;
                        }
                    }
                    else if (getNumber % 7 == 0) {          // This if is just to deal with pretty printing.
                        if (getNumber / 7 == 1) {
                            displayProduct.append("7");
                            break;
                        }
                        else {
                            displayProduct.append("7 x ");
                            getNumber /= 7;
                        }
                    }
                    else if (getNumber % 9 == 0) {
                        if (getNumber / 9 == 1) {           // This if is just to deal with pretty printing.
                            displayProduct.append("9");
                            break;
                        }
                        else {
                            displayProduct.append("9 x ");
                            getNumber /= 9;
                        }
                    }
                    else {
                        if (getNumber == 1) {                 // This if is just to deal with pretty printing.
                            break;
                        }
                        else {
                            displayProduct.append(getNumber);
                            break;
                        }
                    }
                }
                // Dealing an even factor. The lowest factor of even number is 2.
                else  {
                    if (getNumber / 2 == 1) {               // This if is just to deal with pretty printing.
                        displayProduct.append("2");
                        break;
                    }
                    else {
                        displayProduct.append("2 x ");
                        getNumber /= 2;
                    }
                }
            }

            System.out.println(displayProduct.toString());
        }

    }
}
