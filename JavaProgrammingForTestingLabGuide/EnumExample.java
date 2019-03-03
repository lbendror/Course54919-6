package JavaProgrammingForTestingLabGuide;

public class EnumExample {

	public static void main(String[] args) {
		printSeason(Month.AUGUST);
	}

	public static void printSeason(Month month) {

		switch(month) {

		case DECEMBER:
		case JANUARY:
		case FEBRUARY:
			System.out.println("Winter");
			break;
		case MARCH:
		case APRIL:
		case MAY:
			System.out.println("Spring");
			break;
		case JUNE:
		case JULY:
		case AUGUST:
			System.out.println("Summer");
			break;
		case SEPTEMBER:
		case OCTOBER:
		case NOVEMBER:
			System.out.println("Autumn");
			break;
		default:
			System.out.println("I don't know :(");
		}
	}
}
