package String_Level_2;

import java.util.*;

public class Q_9 {
	public static String getComputerChoice() {
	    int choice = (int) (Math.random() * 3);
	    if (choice == 0)
	      return "Rock";
	    else if (choice == 1)
	      return "Paper";
	    else
	      return "Scissors";
	  }

	  public static String findWinner(String user, String computer) {
	    if (user.equalsIgnoreCase(computer)) {
	      return "Draw";
	    }

	    if (user.equalsIgnoreCase("Rock")) {
	      if (computer.equals("Scissors"))
	        return "User";
	      else
	        return "Computer";
	    } else if (user.equalsIgnoreCase("Paper")) {
	      if (computer.equals("Rock"))
	        return "User";
	      else
	        return "Computer";
	    } else if (user.equalsIgnoreCase("Scissors")) {
	      if (computer.equals("Paper"))
	        return "User";
	      else
	        return "Computer";
	    }
	    return "Invalid";
	  }

	  public static String[][] calculate(int userWins, int compWins, int total) {
	    double userPercent = ((double) userWins / total) * 100;
	    double compPercent = ((double) compWins / total) * 100;

	    String[][] stats = new String[2][3];
	    stats[0][0] = "Player Wins";
	    stats[0][1] = "" + userWins;
	    stats[0][2] = String.format("%.2f%%", userPercent);

	    stats[1][0] = "Computer Wins";
	    stats[1][1] = "" + compWins;
	    stats[1][2] = String.format("%.2f%%", compPercent);

	    return stats;
	  }

	  public static void display(String[][] results, String[][] stats) {

	    for (int i = 0; i < results.length; i++) {
	      System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2]);
	    }

	    for (String[] row : stats) {
	      System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
	    }
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter number of games to play: ");
	    int total = sc.nextInt();
	    sc.nextLine();

	    String[][] results = new String[total][3];
	    int userWins = 0, compWins = 0;

	    for (int i = 0; i < total; i++) {
	      System.out.print("Enter your choice (Rock, Paper, Scissors): ");
	      String userChoice = sc.nextLine();

	      String compChoice = getComputerChoice();
	      String winner = findWinner(userChoice, compChoice);

	      if (winner.equals("User"))
	        userWins++;
	      else if (winner.equals("Computer"))
	        compWins++;

	      results[i][0] = userChoice;
	      results[i][1] = compChoice;
	      results[i][2] = winner;
	    }

	    String[][] stats = calculate(userWins, compWins, total);

	    display(results, stats);
	  }
}		
