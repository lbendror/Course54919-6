package ProgramJava;

import java.util.Scanner;

public class Page35ex04_UN170Countries_CanSeveralVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Your Contry Vote: 1=For; 2=Against; 3=Abstention; 4=Veto");
		int currentVote = 0;
		int forCounter = 0;
		int againstCounter = 0;
		int abstentionCounter = 0;
		
		int VetoCounterNumber = -1;
		
		for (int i=1; i<=170; i++) {
			System.out.println("Please enter vote for Country no. " +i);
			currentVote = scanner.nextInt();
			
			if (currentVote == 1) {
				forCounter++;
			}
			else if (againstCounter == 2){
				againstCounter++;
			}
			else if (abstentionCounter == 3){
				abstentionCounter++;
			}
			else if (VetoCounterNumber == 4){
				VetoCounterNumber = i;
				break;
			}
		}
		
		if (VetoCounterNumber != -1) {
			System.out.println("Country no" +VetoCounterNumber+ "Used it's veto!");
		}
		else {
			System.out.println("For votes:" +forCounter+ "Countries");
			System.out.println("Against votes"+againstCounter+ "Countries");
			System.out.println("Abstention votes"+abstentionCounter+ "Countries");
		}
		
		scanner.close();
	}
}
