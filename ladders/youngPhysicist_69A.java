package ladders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class youngPhysicist_69A {

    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int sumX = 0, sumY = 0, sumZ = 0;

        for (int i=0; i<n; i++) {
            String[] firstMultipleInput = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(firstMultipleInput[0]);
            int b = Integer.parseInt(firstMultipleInput[1]);
            int c = Integer.parseInt(firstMultipleInput[2]);
            sumX += a;
            sumY += b;
            sumZ += c;
        }

        // System.out.print("sum: " + sum + "\n");

        if (sumX == 0 && sumY == 0 && sumZ == 0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
