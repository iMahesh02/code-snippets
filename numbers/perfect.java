package numbers;

import java.util.Scanner;

public class perfect {

    /*
    *  A perfect number is a positive number
    *  that is equal to the sum of its positive proper divisors, excluding itself
    *  e.g. 6 is a perfect number
    *  because 1, 2 & 3 are its proper divisors and 1 + 2 + 3 == 6
    * */

    public static boolean isPerfectNum(int num) {

        /* handle 0 & 1 */
        if (num == 0 || num == 1) {
            return true;
        }

        int sum = 0;

        /* computing divisors' sum */
        int numToCheck = num;
        while (num > 1) {
            num = num - 1;
            if (numToCheck % num == 0) {
                sum += num;
            }
        }

        return numToCheck == sum;
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPerfectNum(num))
            System.out.print(num + " is a perfect number\n");
        else
            System.out.print(num + " is not a perfect number\n");
    }
}
