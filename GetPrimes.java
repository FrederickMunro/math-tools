public class GetPrimes {
    private Node head = new Node(2);
    private int maxNum;


    public GetPrimes(int maxNum) {
        this.maxNum = maxNum;
    }

    private void addPrime(int newPrime) {
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                temp.addNode(newPrime);
                break;
            } else {
                temp = temp.next;
            }
        }
    }

    private void primeFinder() {
        Node temp;
        foundPrime:
        for (int i = 3; i <= maxNum; i += 2) {
            for (temp = head; temp != null; temp = temp.next) {
                if (i % temp.prime == 0) {
                    continue foundPrime;
                }
            }
            addPrime(i);
        }
    }

    public int[] getPrimeList() {
        primeFinder();
        Node temp = head;
        int counter = 0;
        int[] primes = new int[Node.counter];

        primes[counter++] = head.prime;
        do {
            temp = temp.next;
            primes[counter++] = temp.prime;
        } while (temp.next != null);
        return primes;
    }


    /**
     * Node class for linked list.
     */
    private class Node {
        private Node next;
        private int prime;
        private static int counter = 0;

        Node(int prime) {
            this.prime = prime;
            next = null;
            counter++;
        }

        private Node addNode(int prime) {
            next = new Node(prime);
            return next;
        }
    }
}
