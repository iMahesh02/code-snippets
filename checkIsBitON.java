import java.util.Scanner;

public class checkIsBitON {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = sc.nextInt();
        int mask = 1 << i;

        if ( (n & mask) > 0) {
            System.out.println("Bit is set");
        } else {
            System.out.println("Bit is not set");
        }
    }
}
