import java.util.Scanner;

public class getAllDivisors {

    static void bruteForceGetDivisors(int n) {
        for (int i=2; i<=n; i++) {
            if (n%i == 0) {
                System.out.println(i);
            }
        }
    }

    static void optimizedGetDivisors(int n) {
        for (int i=2; i*i<=n; i++) {
            if (n%i == 0) {
                System.out.println(i);
                System.out.println(n/i);
            }
        }
    }

    public static void main (String[] ags) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // bruteForceGetDivisors(n);
        optimizedGetDivisors(n);
    }
}
