package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class osuMania {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine()); // Number of test cases

        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine()); // Number of rows in the beatmap

            // Array to store the column indices of '#' for each row
            int[] result = new int[n];

            // Process each row
            for (int i = 0; i < n; i++) {
                String row = reader.readLine(); // Read the row containing exactly one '#'

                // Find the column index (1-indexed)
                for (int j = 0; j < 4; j++) {
                    if (row.charAt(j) == '#') {
                        result[i] = j + 1; // Store the column index (1-indexed)
                        break;
                    }
                }
            }

            // Print results from last row to first row
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(result[i] + " ");
            }
            System.out.println(); // Move to the next test case
        }
    }
}

