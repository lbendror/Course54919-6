package ProgramJava;

public class FunctionExampleVoid {

	static int c=34;

	public static void main(String[] args) {

		int a =5;
		
		System.out.println("c = " +c);
		
		a = doSomething(a);
		System.out.println(a);
		
		System.out.println("c = " +c);
	}

	public static int doSomething(int a) {
		a++;
		c++;
		System.out.println(a);
		return a;
	}
}