package mod3;

public class part3_1 {

	public static void main(String[] args) {
		int maxval = Integer.MAX_VALUE;
		int minval = Integer.MIN_VALUE;
		System.out.println("max int val= " + maxval);
		System.out.println("min int val= " + minval);
		System.out.println("max int val overflow= " + (maxval+1));
		System.out.println("min int val underflow= " + (minval-1));
	}

}
