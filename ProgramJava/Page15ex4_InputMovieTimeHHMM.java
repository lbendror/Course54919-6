package ProgramJava;

public class Page15ex4_InputMovieTimeHHMM {
// קלוט אורך של סרט קולנוע בדקות והצג את אורך הסרט בשעות ודקות.
//	לדוגמא: קלט – 88 , פלט – 1 hour(s) and 28 minute(s)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int movieLengthInMinutes = 88;
		int hoursInMovie = movieLengthInMinutes /60;
		int remainingMinutesInMovie = movieLengthInMinutes % 60;
		
		System.out.println("Movie length: " + hoursInMovie + " hours, " + remainingMinutesInMovie + " minutes");
	}

}
