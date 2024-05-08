import java.util.Scanner;

public class SumOfDiagonalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Creating a 2D array of the specified dimensions
        int[][] matrix = new int[rows][columns];

        // Prompting the user to enter the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculating the sum of diagonal elements
        int sum = 0;
        for (int i = 0; i < Math.min(rows, columns); i++) {
	    System.out.print(matrix[i][i]);
            sum += matrix[i][i];
        }

        // Displaying the sum of diagonal elements
        System.out.println("Sum of diagonal elements in the 2D array: " + sum);

        scanner.close();
    }
}
