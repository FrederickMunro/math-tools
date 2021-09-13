public class PrimeFactorization {
    public static void main(String[] args) {
        int numberCount = args.length;
        int currentNumber, dividedNumber;
        StringBuilder factoredString = new StringBuilder();
        for (int i = 0; i < numberCount; i++) {
            currentNumber = dividedNumber = Integer.parseInt(args[i]);
            factoredString.append("\nThe prime factorization of " + currentNumber + " is:\n  " + currentNumber + "\t: ");
            boolean run = true;
            while (run) {
                nextNum:
                for (int j = 2; j < dividedNumber+1 / 2; j++) {
                    if (dividedNumber % j == 0) {
                        dividedNumber /= j;
                        factoredString.append(" " + j + ",");
                        continue nextNum;
                    }
                }
                break;
            }
            if (dividedNumber != 1) {
                factoredString.append(" " + dividedNumber + "\n\n");
            } else {
                factoredString.append("\n\n");
            }
        }
        System.out.print(factoredString);
    }
}