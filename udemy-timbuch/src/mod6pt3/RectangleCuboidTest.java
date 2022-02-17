package mod6pt3;

public class RectangleCuboidTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 10);
		System.out.println("rect w= " + rect.getWidth());
		System.out.println("rect l= " + rect.getLength());
		System.out.println("rect area= " + rect.getArea());
		
		Cuboid cub = new Cuboid(5, 10, 5);
		System.out.println("cub w = " + cub.getWidth());
		System.out.println("cub l = " + cub.getLength());
		System.out.println("cub area = " + cub.getArea());
		System.out.println("cub h = " + cub.getHeight());
		System.out.println("cub volume = " + cub.getVolume());
		
	}

}
