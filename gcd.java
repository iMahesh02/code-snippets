import java.util.Scanner;

public class gcd {

    /* by brute-force approach */
    static int gcdBF (int a, int b) {
        int iter = 0;
        iter = (a > b) ? a : b;

        for (int i = iter; i >= 1; i--) {
            if ((a % i == 0) && (b % i ==0)) {
                return i;
            }
        }
        return 1;
    }

    /* by Euclid's approach */
    static int gcdEuclid (int a, int b) {

        while (a!=b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    /* by Optimized Euclid's approach - Gabriel Lame */
    static int gcdOptimized(int a, int b) {

        while (a!=0 && b!=0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(gcdBF(a, b) + "");
        // System.out.println(gcdEuclid(a, b) + "");
        System.out.println(gcdOptimized(a, b) + "");
    }
}
