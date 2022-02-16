package mod4pt2;

public class AreaCalc {
	
	//public static final String INVALID_VALUE_MESSAGE = "Invalid value";
	
	public static double area(double radius) {
		
		return (radius<0 ? -1 : Math.PI*radius*radius);
	}
	
	public static double area(double x, double y) {
		return ((x<0)||(y<0) ? -1 : x*y);
	}
	
	public static double area(double a, double b, double c) {
		double s = (a+b+c)/2;
		return ((a<0)||(b<0)||(c<0) ? -1 : Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}

}
