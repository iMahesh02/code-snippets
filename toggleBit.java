import java.util.Scanner;

public class toggleBit {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i = sc.nextInt();

        int mask = 1 << i;

        System.out.println(x ^ mask);
    }
}
