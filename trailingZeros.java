import java.util.Scanner;

public class trailingZeros {

    /* calculate the no. of trailing zeros in a factorial */
    static int countZeros(int n) {
        int count = 0;
        int powOf5 = 5;

        while (n >= powOf5) {
            count += n/powOf5;
            powOf5 = 5 * powOf5;
        }
        return count;
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countZeros(n)+"");
    }
}
