package ProgramJava;
import java.util.Scanner;
public class Page43ex05_SupplierBottlePrice {
	//static int numberOfPoints = 0;
	
	public static int calculateFine(int bottlePrice, int brokenBottles, int lostCrates) {
		int fine = 0;
		if (brokenBottles >= 3 && brokenBottles <= 5) {
			fine += bottlePrice;
		}
		else if (brokenBottles >= 6 && brokenBottles <= 10) {
			fine += bottlePrice * 2;
		}
		else if (brokenBottles > 10) {
			fine += bottlePrice * 4;
		}
		if (lostCrates >= 1) {
			fine += lostCrates * bottlePrice * 10;
		}
		return fine;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i=1; i<=4; i++) { // 4 Suppliers of hangover
			System.out.println("Supplier " + i + " - Bottle Price NIS ?");
			int bottlePrice = scanner.nextInt();
			
			System.out.println("Supplier " + i + " - Number of Broken Bottles: ? \nBrokenBottles 3<>5 = bottlePrice * 1, \nBrokenBottles 6<>10 = BottlePrice * 2, \nBrokenBottles>10=BottlePrice * 4");
			int brokenBottles = scanner.nextInt();
			
			System.out.println("Supplier " + i + " - Number of Lost Crates ? (One lostCrates = bottlePrice * 10)");
			int lostCrates = scanner.nextInt();
			
			System.out.println("\nBottle Price: " +bottlePrice+ "\nBroken Bottles: " +brokenBottles+ "\nLost Crates :" +lostCrates+ "\nFine for supplier "+ i+" is: " +calculateFine(bottlePrice, brokenBottles, lostCrates)+"NIS");
			System.out.println("------------------------------------");
		}
		scanner.close();
	}
}