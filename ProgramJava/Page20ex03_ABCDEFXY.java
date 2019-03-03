package ProgramJava;

import java.util.Scanner;

public class Page20ex03_ABCDEFXY {

	public static void main(String[] args) {
/*
     C x E - B x F
X =  -------------
     A x E - B x D
     
     A x F - C x D
Y =  -------------
     A x E - B x D
     
C = A * x + B * y
F = D * x + E * y
*/
		Scanner input = new Scanner(System.in);
		
		double A,B,C,D,E,F;
		double x,x1,x2,y,y1,y2;
		
		System.out.println("Please Enter Values A,B,C,D,E,F :");
		A = input.nextInt();
		System.out.println(" A=" +A);
		B = input.nextInt();
		System.out.println(" B=" +B);
		C = input.nextInt();
		System.out.println(" C=" +C);
		D = input.nextInt();
		System.out.println(" D=" +D);
		E = input.nextInt();
		System.out.println(" E=" +E);
		F = input.nextInt();
		System.out.println(" F=" +F);

		x1 = (float)(C*E) - (float)(B*F);
		x2 = (float)(A*E) - (float)(B*D);
		x = x1/x2;
		System.out.println("\r\n x1 = C x E - B x F= " +x1+"\r\n x2 = A x E - B x D= "+x2+"\r\n The sum X=x1/x2= " +x);
		
		y1 = (float)(A*F) - (float)(C*D); 
		y2 = (float)(A*E) - (float)(B*D);
		y = y1/y2;
		System.out.println("\r\n y1 = A x F - C x D= "+y1+"\r\n y2 = A x E - B x D= "+y2+"\r\n The sum Y=y1/y2 = " +y);

		C = (float)(A * x) + (float)(B * y);
		System.out.println("\r\nC = A * x + B * y= "+C);
		System.out.println(+C+" = ("+A+" * "+x+") + ("+B+" * "+y+")");
		
		F = (float)(D * x) + (float)(E * y);
		System.out.println("\r\nF = D * x + E * y= " +F);
		System.out.println(+F+" = ("+D+" * "+x+") + ("+E+" * "+y+")");
		
		if (x2==0 || y2==0)
			System.out.println("Equation has no solution");
		
		input.close();		
		}
	}
