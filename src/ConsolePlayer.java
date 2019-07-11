import java.util.Scanner;

public class ConsolePlayer extends Player {

	

	public ConsolePlayer(String name) {
		super(name);
	}
	
	
	@Override
	public Roshambo generateRoshambo() {
		Scanner scnr = new Scanner(System.in);
		Roshambo input = Roshambo.PAPER;
		boolean valid = true;
		do {
			valid = true;
			System.out.println("Rock, Paper or Scissors? (R/P/S): ");
			String choice = scnr.nextLine();
			if (choice.equalsIgnoreCase("R")) {
				input = Roshambo.ROCK;
			} else if (choice.equalsIgnoreCase("P")) {
				input = Roshambo.PAPER;
			} else if (choice.equalsIgnoreCase("S")) {
				input = Roshambo.SCISSORS;
			} else {
				System.out.println("Invalid input. Try again.");
				valid = false;
			}
		} while (!valid);
		scnr.close();
		return input;
	}

}
