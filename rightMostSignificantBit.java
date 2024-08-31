import java.util.Scanner;

public class rightMostSignificantBit {

    static int rightMSB(int n) {
        int m = 1;
        int mask = m << 1;
        int pos = 0;

        if (n == 0) {
            return -1;
        }
        while ( (n & m) == 0) {
            m = m << 1;
            pos ++;
        }

        return pos + 1;
    }

    static int efficientRMSB(int n) {
        int mask = (n & (n - 1));
        int v = n ^ mask;
        return (int) (Math.log10(v) / Math.log10(2));
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
//        int val = rightMSB(sc.nextInt());
        int val = efficientRMSB(sc.nextInt());
        System.out.println(val);
    }
}
