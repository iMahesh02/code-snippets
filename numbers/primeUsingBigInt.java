package numbers;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class primeUsingBigInt {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger b = new BigInteger(n);

        if (b.isProbablePrime(100)) {
            System.out.print("prime");
        } else {
            System.out.print("not prime");
        }

        bufferedReader.close();
    }
}
