package mod6pt3;

public class CircleCylinderTest {

	public static void main(String[] args) {
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());
		
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + Double.toString(cylinder.getRadius()));
		System.out.println("cylinder.height= " + Double.toString(cylinder.getHeight()));
		System.out.println("cylinder.area= " + Double.toString(cylinder.getArea()));
		System.out.println("cylinder.volume= " + Double.toString(cylinder.getVolume()));
		
		/*System.out.println("cylinder.radius= ", + cylinder.getRadius());
		System.out.println("cylinder.height= ", + cylinder.getHeight());
		System.out.println("cylinder.area= ", + cylinder.getArea());
		System.out.println("cylinder.volume= ", + cylinder.getVolume());
		*/
		
		//due to commas after first string in println()
		//it was not accepting + operator
		//removing commas resolved the issue
		//no need to typecast with Double.toString()
		//it works auto in case of circle object above
	}
	
	//Double.toString()  --- template purpose

}
