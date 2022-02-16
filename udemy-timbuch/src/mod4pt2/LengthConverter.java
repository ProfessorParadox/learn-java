package mod4pt2;

public class LengthConverter {
	
	public static double calcFtAndInchToCm(double feet, double inch) {
		if(feet<0 || (inch<0 || inch>12)) {
			System.out.println("Invalid Feet or Inches");
			return -1;
		}
		else {
			inch += feet*12;
			double cm = 2.54*(feet*12 + inch);
			return cm;
		}
	}
	public static double calcFtAndInchToCm(double inch) {
		if(inch<0) {
			return -1;
		} 
		else {
			double feet = (int) inch/12;
			inch = (int) inch%12;
			return (calcFtAndInchToCm(feet, inch));
		}
	}
}
