package arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Set matrix dimensions
        int rows = 5;
        int cols = 5;

        // Create a 5x5 2D array
        int[][] array = new int[rows][cols];

        System.out.println("Enter the 5x5 matrix row by row (space-separated):");

        // Read each row, split the input, and store the values in the array
        for (int i = 0; i < rows; i++) {
            String[] input = reader.readLine().split(" ");  // Split the input line by spaces
            for (int j = 0; j < cols; j++) {
                array[i][j] = Integer.parseInt(input[j]);  // Parse each element and store in the array
            }
        }

        // Output the 5x5 array
        System.out.println("The 5x5 matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
