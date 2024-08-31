import java.util.Scanner;

public class primeNums {

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        } else if (n%2==0 || n%3==0) {
            return false;
        }
        for (int i=5; i<=n/2; i++) {
            if (n%5==0 || n%7==0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        System.out.println("Enter a number to check");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Value of x: "+x);
        System.out.println("isPrime: " + isPrime(x));
    }
}
