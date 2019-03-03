package ProgramJava;

public class Page31ex01_PeletOfTheDiagram {

	public static void main(String[] args) {
		
		int b = 32;
		int c = -1 * b;
		
		for (int a = b; a > 1; a+=c) {
			
			c = c / 2;
			b = b - 8;
		}
		
		System.out.println("b = " + b);
	}
}
