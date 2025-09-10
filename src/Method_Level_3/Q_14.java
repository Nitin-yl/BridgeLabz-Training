package Method_Level_3;

import java.util.*;

public class Q_14 {
	public static int[][] createMatrix(int rows, int cols) {
	    Random rand = new Random();
	    int[][] matrix = new int[rows][cols];

	    for (int i = 0; i < rows; i++) {
	      for (int j = 0; j < cols; j++) {
	        matrix[i][j] = rand.nextInt(10);
	      }
	    }
	    return matrix;
	  }

	  public static int[][] addMatrices(int[][] A, int[][] B) {
	    int rows = A.length;
	    int cols = A[0].length;
	    int[][] result = new int[rows][cols];

	    for (int i = 0; i < rows; i++) {
	      for (int j = 0; j < cols; j++) {
	        result[i][j] = A[i][j] + B[i][j];
	      }
	    }
	    return result;
	  }

	  public static int[][] subtractMatrices(int[][] A, int[][] B) {
	    int rows = A.length;
	    int cols = A[0].length;
	    int[][] result = new int[rows][cols];

	    for (int i = 0; i < rows; i++) {
	      for (int j = 0; j < cols; j++) {
	        result[i][j] = A[i][j] - B[i][j];
	      }
	    }
	    return result;
	  }

	  public static int[][] multiplyMatrices(int[][] A, int[][] B) {
	    int rowsA = A.length;
	    int colsA = A[0].length;
	    int rowsB = B.length;
	    int colsB = B[0].length;

	    int[][] result = new int[rowsA][colsB];

	    for (int i = 0; i < rowsA; i++) {
	      for (int j = 0; j < colsB; j++) {
	        for (int k = 0; k < colsA; k++) {
	          result[i][j] += A[i][k] * B[k][j];
	        }
	      }
	    }
	    return result;
	  }

	  public static void printMatrix(int[][] matrix) {
	    for (int[] row : matrix) {
	      for (int value : row) {
	        System.out.print(value + "\t");
	      }
	      System.out.println();
	    }
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter rows of Matrix A: ");
	    int rowsA = sc.nextInt();
	    System.out.print("Enter cols of Matrix A: ");
	    int colsA = sc.nextInt();
	    System.out.print("Enter rows of Matrix B: ");
	    int rowsB = sc.nextInt();
	    System.out.print("Enter cols of Matrix B: ");
	    int colsB = sc.nextInt();

	    int[][] A = createMatrix(rowsA, colsA);
	    int[][] B = createMatrix(rowsB, colsB);

	    System.out.println("\nMatrix A:");
	    printMatrix(A);

	    System.out.println("\nMatrix B:");
	    printMatrix(B);

	    if (rowsA == rowsB && colsA == colsB) {
	      System.out.println("\nA + B:");
	      printMatrix(addMatrices(A, B));

	      System.out.println("\nA - B:");
	      printMatrix(subtractMatrices(A, B));
	    } else {
	      System.out.println("\nCannot Do it ");
	    }

	    System.out.println("\nA x B:");
	    printMatrix(multiplyMatrices(A, B));

	  }
}
