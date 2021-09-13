public class PrimeFinder {
    public static void main(String[] args) {
        if (Integer.parseInt(args[0]) < 2) {
            System.out.println("\nThere are no prime numbers below 2.");
            System.exit(0);
        }
        GetPrimes myList = new GetPrimes(Integer.parseInt(args[0]));
        int[] primes = myList.getPrimeList();

        System.out.print("\nHere are the prime numbers below " + args[0] + ":\n\t2");
        for (int i = 1; i < primes.length; i++) {
            System.out.print(", " + primes[i]);
        }
        System.out.println("\n");
    }
}
