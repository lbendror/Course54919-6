package ProgramJava;

import java.util.Scanner;

public class Page32ex07_InputNOutputSdarot {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println(i);
		}
		
		System.out.println("----");
		
		for (int i=1; i<=n; i++) { // implementation 1
			System.out.println(i*2);
		}
		
		System.out.println("----"); // implementation 2 with same result:
		
		for (int i=2; i<=n*2; i+=2) { // i=i+2
			System.out.println(i);
		}
		
		scanner.close();
	}
}
/*
Enter a number
9
1
2
3
4
5
6
7
8
9
----
2
4
6
8
10
12
14
16
18
----
2
4
6
8
10
12
14
16
18

*/