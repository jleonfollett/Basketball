package game;

public class Teams {
	private Players[] playerList = new Players[5];
	private String name;
	private int teamSpeed;
	private int teamOffense;
	private int teamDefense;
	
	public Teams(String name, Players[] team){
		for (int i = 0; i < 5; i++){
			this.teamOffense += team[i].getOffense();
		}
		for (int i = 0; i < 5; i++){
			this.teamDefense += team[i].getDefense();
		}
		for (int i = 0; i < 5; i++){
			this.teamSpeed += team[i].getSpeed();
		}
		this.name = name;
		
	}
	public Players[] getplayerList() {
		return playerList;
	}
	public void setplayerList(Players[] playerList) {
		this.playerList = playerList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTeamOffense() {
		return teamOffense;
	}
	public void setTeamOffense(int teamOffense) {
		this.teamOffense = teamOffense;
	}
	public int getTeamDefense() {
		return teamDefense;
	}
	public void setTeamDefense(int teamDefense) {
		this.teamDefense = teamDefense;
	}
	public int getTeamSpeed() {
		return teamSpeed;
	}
	public void setTeamSpeed(int teamSpeed) {
		this.teamSpeed = teamSpeed;
	}
	
}
