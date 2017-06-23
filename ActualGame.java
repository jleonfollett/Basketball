package game;

public class ActualGame {
	private Teams teamA;
	private Teams teamB;
	private int teamAScore;
	private int teamBScore;
	private String teamWinner;
	
	public ActualGame(Teams teamA, Teams teamB){
		this.teamA = teamA;
		this.teamB = teamB;
		this.calcScore();
		checkTeamWinner();
		printWinner();
	}
	public void printWinner(){
		System.out.println("The " + teamWinner + " win the game!  The score was " + Integer.toString(this.getTeamAScore()) + " - " + Integer.toString((this.getTeamBScore())));
	}
	public void checkTeamWinner(){
		if (this.teamAScore > this.teamBScore){
			setteamWinner(teamA.getName());

		}
		if (this.teamAScore == this.teamBScore){
			if (this.teamA.getTeamSpeed() > this.teamB.getTeamSpeed()){
				this.setTeamAScore(this.getTeamAScore() + 1);
				checkTeamWinner();

			}
			else {
				this.setTeamBScore(this.getTeamBScore() + 1);
				checkTeamWinner();

			  }
		}
		else {
			setteamWinner(teamB.getName());
		  }
		}
	public void calcScore(){
		teamAScore = teamA.getTeamOffense() - teamB.getTeamDefense();
		teamBScore = teamB.getTeamOffense() - teamA.getTeamDefense();
	}
	public Teams getTeamA() {
		return teamA;
	}
	public void setTeamA(Teams teamA) {
		this.teamA = teamA;
	}
	public Teams getTeamB() {
		return teamB;
	}
	public void setTeamB(Teams teamB) {
		this.teamB = teamB;
	}
	public int getTeamAScore() {
		return teamAScore;
	}
	public void setTeamAScore(int teamAScore) {
		this.teamAScore = teamAScore;
	}
	public int getTeamBScore() {
		return teamBScore;
	}
	public void setTeamBScore(int teamBScore) {
		this.teamBScore = teamBScore;
	}
	public String isteamWinner() {
		return teamWinner;
	}
	public void setteamWinner(String teamWinner) {
		this.teamWinner = teamWinner;
	}
	
	}
	
	

