package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class osumania {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine()); // Number of test cases

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine()); // Number of rows in the beatmap

            // Process each row
            for (int i = 0; i < n; i++) {
                String row = reader.readLine(); // Read the row containing exactly one '#'

                // Find the column index (1-indexed)
                for (int j = 0; j < 4; j++) {
                    if (row.charAt(j) == '#') {
                        System.out.print((j) + " ");
                        break;
                    }
                }
            }
            System.out.println(); // Move to the next test case
        }
    }
}

