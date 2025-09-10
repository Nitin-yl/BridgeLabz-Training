package Method_Level_3;

import java.util.*;

public class Q_15 {
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

		  public static void printMatrix(double[][] matrix) {
		    for (double[] row : matrix) {
		      for (double value : row) {
		        System.out.print(value + "\t");
		      }
		      System.out.println();
		    }
		  }

		  public static void printMatrix(int[][] matrix) {
		    for (int[] row : matrix) {
		      for (int value : row) {
		        System.out.print(value + "\t");
		      }
		      System.out.println();
		    }
		  }

		  public static int[][] transpose(int[][] matrix) {
		    int rows = matrix.length;
		    int cols = matrix[0].length;
		    int[][] transposed = new int[cols][rows];

		    for (int i = 0; i < rows; i++) {
		      for (int j = 0; j < cols; j++) {
		        transposed[j][i] = matrix[i][j];
		      }
		    }
		    return transposed;
		  }

		  public static int determinant2x2(int[][] matrix) {
		    return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
		  }

		  public static int determinant3x3(int[][] matrix) {
		    int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
		    int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
		    int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];

		    return a * (e * i - f * h)
		        - b * (d * i - f * g)
		        + c * (d * h - e * g);
		  }

		  public static double[][] inverse2x2(int[][] matrix) {
		    int det = determinant2x2(matrix);

		    double[][] inverse = new double[2][2];
		    inverse[0][0] = matrix[1][1] / (double) det;
		    inverse[0][1] = -matrix[0][1] / (double) det;
		    inverse[1][0] = -matrix[1][0] / (double) det;
		    inverse[1][1] = matrix[0][0] / (double) det;

		    return inverse;
		  }

		  public static double[][] inverse3x3(int[][] matrix) {
		    int det = determinant3x3(matrix);

		    double[][] inverse = new double[3][3];

		    inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) det;
		    inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) det;
		    inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) det;

		    inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) det;
		    inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) det;
		    inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) det;

		    inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) det;
		    inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) det;
		    inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) det;

		    return inverse;
		  }

		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int[][] matrix2x2 = createMatrix(2, 2);
		    System.out.println("2x2 Matrix:");
		    printMatrix(matrix2x2);

		    System.out.println("\nTranspose:");
		    printMatrix(transpose(matrix2x2));

		    int det2 = determinant2x2(matrix2x2);
		    System.out.println("\nDeterminant: " + det2);

		    if (det2 != 0) {
		      System.out.println("\nInverse:");
		      printMatrix(inverse2x2(matrix2x2));
		    }

		    int[][] matrix3x3 = createMatrix(3, 3);
		    System.out.println("\n3x3 Matrix:");
		    printMatrix(matrix3x3);

		    System.out.println("\nTranspose:");
		    printMatrix(transpose(matrix3x3));

		    int det3 = determinant3x3(matrix3x3);
		    System.out.println("\nDeterminant: " + det3);

		    if (det3 != 0) {
		      System.out.println("\nInverse:");
		      printMatrix(inverse3x3(matrix3x3));
		    }
		  }
}
