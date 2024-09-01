package numbers;

import java.util.Scanner;

public class armstrong {
    /*
    *  n = 153
    *  k = number of digits
    *  1^k + 5^k + 3^k == 153 ---> A narcissistic number (or Armstrong number)
    * */

    public static boolean isArmstrongNum(int num) {
        int k = 0;
        int sum = 0;
        int numForOperation = num;
        int numToCompare = num;

        /* counting the number of digits */
        while (num > 0) {
            num = num/10;
            k++;
        }

        /* taking sum of num to the power of countOfDigits */
        while (numForOperation > 0) {
            int rem = numForOperation % 10;
            sum += (int) Math.pow(rem, k);
            numForOperation = numForOperation/10;
        }

        return numToCompare == sum;
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isArmstrongNum(num))
            System.out.print(num + " is an Armstrong number\n");
        else
            System.out.print(num + " is not a Armstrong number\n");
    }
}
