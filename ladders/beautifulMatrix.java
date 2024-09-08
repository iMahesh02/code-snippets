package ladders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beautifulMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int matrixSize = 5;
        int rowOfOne = -1, colOfOne = -1;

        // Read the matrix and find the position of '1'
        for (int i = 0; i < matrixSize; i++) {
            // Split the input based on one or more spaces
            String[] input = reader.readLine().trim().split("\\s+");
            for (int j = 0; j < matrixSize; j++) {
                if (Integer.parseInt(input[j]) == 1) {
                    rowOfOne = i;
                    colOfOne = j;
                }
            }
        }

        // The target center position is (2, 2) in 0-based index
        int centerRow = 2;
        int centerCol = 2;

        // Calculate the number of moves to bring '1' to the center
        int moves = Math.abs(rowOfOne - centerRow) + Math.abs(colOfOne - centerCol);

        // Output the result
        System.out.println(moves);
    }
}
