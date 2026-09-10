@FunctionalInterface
interface NumberChecker {
    boolean checkNumber(int number);
}

@FunctionalInterface
interface CharChecker {
    void checkChar(char character);
}

public class Main {

    // Static method to check whether a number is prime
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Anonymous Inner Class for NumberChecker
        NumberChecker numberChecker = new NumberChecker() {

            @Override
            public boolean checkNumber(int number) {
                return isPrime(number);
            }
        };

        int num = 7;

        if (numberChecker.checkNumber(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }

        // Anonymous Inner Class for CharChecker
        CharChecker charChecker = new CharChecker() {

            @Override
            public void checkChar(char character) {

                int ascii = character;

                if (isPrime(ascii)) {
                    System.out.println("ASCII value of '" + character + "' = " + ascii + " is Prime");
                } else {
                    System.out.println("ASCII value of '" + character + "' = " + ascii + " is Not Prime");
                }
            }
        };

        charChecker.checkChar('A');
    }
}