package ProgramJava;

import java.util.Scanner;

public class Page43ex01_MaccabisScoreForGame {

	static int numberOfPoints = 0;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i=1; i<=3; i++) {
			
			System.out.println("Maccabi's score for game " + i + "?");
			int maccabiScore = scanner.nextInt();
			
			System.out.println("Opponent's score for game " + i + "?");
			int opponentScore = scanner.nextInt();
			
			updatePoints(maccabiScore, opponentScore);
		}
		
		System.out.println("Maccabi's points: " + numberOfPoints);
		
		scanner.close();
	}
	
	public static void updatePoints(int maccabiScore, int opponentScore) {
		
		if (maccabiScore > opponentScore) {
			numberOfPoints += 2;
		}
		else if (maccabiScore == opponentScore) {
			numberOfPoints ++;
		}
	}
}
