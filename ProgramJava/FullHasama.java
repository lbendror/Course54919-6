package ProgramJava;

import java.util.Scanner;

public class FullHasama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
// Full ׳Hasama׳		
// האופרטור (׳int׳) מקצץ את חלק השבר מביטוי ומשאיר את החלק השלם		
/* 
לדוגמא:
קליטת מספר הילדים בגן רקפת
ומספר פרוסות העוגה.
הצגת מספר הפרוסות שאפשר
לתת לכל ילד ומספר הפרוסות
שיישארו לגננת
*/	
	int kids, cake, each, left;
	System.out.println("Please enter the number of kids: ");
	kids = scan.nextInt(); // Number of kids
	System.out.println("Please enter number of cake pieces: ");
	cake = scan.nextInt(); // NUmber of cake piece
	
	each = cake / kids; // piece cake per kid
	left = cake % kids; // pieces cake left over
	System.out.println("Each kid gets: " + each + " slices leaving " + left + " slices for Rakefet");
	
		scan.close();
	}

}
