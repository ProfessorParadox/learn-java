package mod4pt2;

public class MinutesToYearsDaysCalculator {
	
	public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	
	public static void printYearsAndDays(long minutes) {
		
		if(minutes<0) {
			System.out.println(INVALID_VALUE_MESSAGE);
		}
		else {
			long days = (long) minutes / (60*24);
			long years = days / 365;
			long remDays = days % 365;
		
			System.out.println(minutes + " min = " + years + (" y and ") + remDays + (" d"));
		}
	}

}
