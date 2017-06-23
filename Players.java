package game;

public class Players {
	private String name;
	private int speed;
	private int offense;
	private int defense;
	
	public Players(){};
	
	public Players(String name, int initSpeed, int initOffense, int initDefense){
		this.name = name;
		this.speed = initSpeed;
		this.offense = initOffense;
		this.defense = initDefense;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getOffense() {
		return offense;
	}
	public void setOffense(int offense) {
		this.offense = offense;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
}
