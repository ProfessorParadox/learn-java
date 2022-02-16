package mod4;

public class SpeedConverter {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		printConversion(3.5);
	}*/
	
	public static long toMilesPerHour(double kmph) {
		
		if(kmph<0) {
			return -1;
		}
		long mph = Math.round(kmph / 1.609);
		return mph;
	}
	
	public static void printConversion(double kmph) {
		
		if(kmph<0) {
			System.out.println("invalid value!");
		} else {
		    long mph = toMilesPerHour(kmph);
		    System.out.println(kmph + " km/h = " + mph + " mi/h");
		}
	}

}
