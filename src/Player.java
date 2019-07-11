
public abstract class Player {
	String name;
	
	public Player(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

}
