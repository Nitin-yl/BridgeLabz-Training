package Method_Level_2;

import java.util.*;

public class Q_12 {
	public static int[] generateDigit(int size) {
	    int[] arr = new int[size];
	    for (int i = 0; i < size; i++) {
	      arr[i] = 1000 + (int) (Math.random() * 9000);
	    }
	    return arr;
	  }

	  public static double[] findAvg(int[] numbers) {
	    int sum = 0;
	    int min = numbers[0];
	    int max = numbers[0];

	    for (int num : numbers) {
	      sum += num;
	      min = Math.min(min, num);
	      max = Math.max(max, num);
	    }

	    double average = (double) sum / numbers.length;
	    return new double[] { average, min, max };
	  }

	  public static void main(String[] args) {

	    int[] randomNumbers = generateDigit(5);

	    System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));

	    double[] stats = findAvg(randomNumbers);

	    System.out.println("Average value: " + stats[0]);
	    System.out.println("Minimum value: " + stats[1]);
	    System.out.println("Maximum value: " + stats[2]);
	  }
}
