import java.util.Scanner;

public class RoshamboApp {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int userScore = 0;
		int oppScore = 0;
		int drawCount = 0;
		
		RockPlayer dwayne = new RockPlayer("dwayne");
		RandomPlayer chirpus = new RandomPlayer("chirpus");
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		Player player = new ConsolePlayer(name);
		boolean valid = true;
		do {
			valid = true;
			System.out.println("Would you like to play Dwayne or Chirpus?");
			String opponent = scanner.nextLine();
			
			//System.out.println("Rock, Paper or Scissors? (R/P/S): ");
			Roshambo userChoice = player.generateRoshambo();
			Roshambo opponentChoice;
			if (opponent.equalsIgnoreCase("dwayne")) {
				opponentChoice = dwayne.generateRoshambo();
			} else {
				opponentChoice = chirpus.generateRoshambo();
			}
			System.out.println(name + ": " + userChoice);
			System.out.println(opponent + ": " + opponentChoice);
			
			if(userChoice == opponentChoice) {
				System.out.println("Draw!");
				drawCount++;
			}else if (userChoice == Roshambo.ROCK && opponentChoice == Roshambo.SCISSORS) {
				System.out.println(name + " Wins!");
				userScore++;
			}else if (userChoice == Roshambo.ROCK && opponentChoice == Roshambo.PAPER) {
				System.out.println(opponent + " Wins!");
				oppScore++;
			}else if (userChoice == Roshambo.PAPER && opponentChoice == Roshambo.SCISSORS) {
				System.out.println(opponent + " Wins!");
				oppScore++;
			}else if (userChoice == Roshambo.PAPER && opponentChoice == Roshambo.ROCK) {
				System.out.println(name + " Wins!");
				userScore++;
			}else if (userChoice == Roshambo.SCISSORS && opponentChoice == Roshambo.PAPER) {
				System.out.println(name + " Wins!");
				userScore++;
			}else if (userChoice == Roshambo.SCISSORS && opponentChoice == Roshambo.ROCK) {
				System.out.println(opponent + " Wins!");
				oppScore++;
			}
			
			System.out.println("Play again? (y/n): ");
			String temp = scanner.nextLine();
			if(temp.equalsIgnoreCase("y")) {
				valid = true;
			}else {
				valid = false;
			}
		} while (valid);
		
		System.out.println("You won " + userScore + " times.");
		System.out.println("You lost " + oppScore + " times.");
		System.out.println("You had " + drawCount + " draws.");
		
		

	}// main

}// class
