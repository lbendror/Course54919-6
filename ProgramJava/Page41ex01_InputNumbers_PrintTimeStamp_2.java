package ProgramJava;

import java.util.Scanner;

public class Page41ex01_InputNumbers_PrintTimeStamp_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter hour:");
		int hours = scanner.nextInt();
		
		System.out.println("Enter minutes:");
		int minutes = scanner.nextInt();
		
		System.out.println("Enter seconds:");
		int seconds = scanner.nextInt();
		
		String hoursStr = clockFormat(hours);
		String minutesStr = clockFormat(minutes);
		String secondsStr = clockFormat(seconds);
		
		System.out.println(hoursStr + ":" + minutesStr + ":" + secondsStr);
		
		scanner.close();
	}
	
	public static String clockFormat(int time) {
		
		if (time < 10) {
			return "0" + time;
		}
		else {
			return time + "";
		}
	}
}
