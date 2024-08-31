import java.util.Scanner;

public class countDigits {

     static int countNums(int n) {
        int count = 0;
        while (n > 0) {
            n = n/10;
            count ++;
        }
        return count;
    }

    public static void main (String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sn.nextInt();
        int x = countNums(n);
        System.out.println(x);
    }
}
