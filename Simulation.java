package game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Simulation {
	static Map<String, Players> playerNames = new HashMap<String, Players>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players Player1 = new Players("John", 50, 80, 50);
		Players Player2 = new Players("Mike", 5, 5, 5);
		Players Player3 = new Players("Duncan", 5, 5, 5);
		Players Player4 = new Players("Luke", 5, 5, 5);
		Players Player5 = new Players("Rhonda", 5, 5, 5);
		Players Player6 = new Players("Curry", 5, 100, 80);
		Players Player7 = new Players("Durant", 5, 90, 90);
		Players Player8 = new Players("Green", 5, 5, 5);
		Players Player9 = new Players("Thompson", 5, 5, 5);
		Players Player10 = new Players("Bryant", 5, 5, 5);
		playerNames.put(Player1.getName(), Player1);
		playerNames.put(Player2.getName(), Player2);
		playerNames.put(Player3.getName(), Player3);
		playerNames.put(Player4.getName(), Player4);
		playerNames.put(Player5.getName(), Player5);
		playerNames.put(Player6.getName(), Player6);
		playerNames.put(Player7.getName(), Player7);
		playerNames.put(Player8.getName(), Player8);
		playerNames.put(Player9.getName(), Player9);
		playerNames.put(Player10.getName(), Player10);
		Players a = pickPlayers(playerNames, 1);		
		Players b = pickPlayers(playerNames, 1);		
		Players c = pickPlayers(playerNames, 1);		
		Players d = pickPlayers(playerNames, 1);		
		Players e = pickPlayers(playerNames, 1);		
		Players f = pickPlayers(playerNames, 2);		
		Players g = pickPlayers(playerNames, 2);		
		Players h = pickPlayers(playerNames, 2);		
		Players i = pickPlayers(playerNames, 2);		
		Players j = pickPlayers(playerNames, 2);				
		Teams teamA = buildTeam(a, b, c, d, e, 1);
		Teams teamB = buildTeam(f, g, h, i, j, 2);
		new ActualGame(teamA, teamB);
	}
	
	public static Players pickPlayers(Map<String, Players> nameList, int f){
		
		System.out.println("\n Pick a player from: " + nameList.keySet() + " for team: " + f + "\n");
		Players A = new Players();
		@SuppressWarnings("resource")
		Scanner pickPlayers = new Scanner(System.in);
		String userInput = pickPlayers.nextLine();
		//Makes users case match my String
		String newInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1).toLowerCase();
		if (nameList.containsKey(newInput)){
			A = nameList.get(newInput);
			nameList.remove(newInput);
	} else {
		System.out.println("You did not pick a player from the list.");
		A = pickPlayers(nameList, f);
	}
		return A;
}
	public static Teams buildTeam(Players a, Players b, Players c, Players d, Players e, int f){
		System.out.println("\n Enter the name for team " + f + "\n");
		Players[] playerAList = new Players[5];
		@SuppressWarnings("resource")
		Scanner pickTeamName = new Scanner(System.in);
		String teamName = pickTeamName.nextLine();
		playerAList[0] = a;
		playerAList[1] = b;
		playerAList[2] = c;
		playerAList[3] = d;
		playerAList[4] = e;
		Teams teamA = new Teams(teamName, playerAList);
		return teamA;
	}
	}
