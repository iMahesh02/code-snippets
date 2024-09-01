package numbers;

import java.util.Scanner;

public class palindrome {

    public static boolean isNumPalindrome(int num) {
        StringBuilder axpNum = new StringBuilder();
        int numToCompare = num;
        while (num > 0) {
            int rem = num % 10;
            axpNum.append(rem);
            num = num / 10;
        }
        return numToCompare == Integer.parseInt(String.valueOf(axpNum));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isNumPalindrome(num))
            System.out.print(num + " is a palindrome\n");
        else
            System.out.print(num + " is not a palindrome\n");
    }
}
