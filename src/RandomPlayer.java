
public class RandomPlayer extends Player{
	

	public RandomPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Roshambo generateRoshambo() {
		int temp = (int)(Math.random() * 3 + 1);
		
		if(temp == 1) {
			return Roshambo.ROCK;
		}else if (temp == 2) {
			return Roshambo.PAPER;
		}else {
			return Roshambo.SCISSORS;
		}
		
	}
}
