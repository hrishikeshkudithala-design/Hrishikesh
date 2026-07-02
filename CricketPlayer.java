package coreproject1;
public class CricketPlayer {
	static String teamName="India";
	String playerName;
	int runs;
	public static void main(String[] args) {
    System.out.println("Displaying Cricket Player Management System...");
    CricketPlayer cp1 = new CricketPlayer();
    cp1.playerName="Rohit Sharma";
    cp1.runs=320;
    System.out.println(teamName);
    System.out.println("playerName: "+cp1.playerName);
    System.out.println("Runs: "+cp1.runs);
    CricketPlayer cp2 = new CricketPlayer();
    cp2.playerName="Virat Kohli";
    cp2.runs=250;
    System.out.println(teamName);
    System.out.println("playerName: "+cp2.playerName);
    System.out.println("Runs: "+cp2.runs);
	}
}