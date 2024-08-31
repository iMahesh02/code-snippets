import java.util.Scanner;

public class sieveOfEratosthenes {

    static void sievePrintPrimes(int n) {
        boolean[] prime = new boolean[n+1];
        for (int i=2; i<=n; i++) {
            if (prime[i] == false) {
                for (int j=i*2; j<=n; j=j+i) {
                    prime[j] = true;
                }
            }
        }
        for (int i=2; i<=n; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }
    }

    static void sieveOptimized(int n) {
        boolean[] prime = new boolean[n+1];
        for (int i=2; i*i<=n; i++) { // i <= root of n
            if (prime[i] == false) {
                for (int j=i*i; j<=n; j=j+i) {
                    prime[j] = true;
                }
            }
        }
        for (int i=2; i<=n; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sievePrintPrimes(n);
        sieveOptimized(n);
    }
}
