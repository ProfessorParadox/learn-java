package mod4;

public class PosNegZero {
	//to run program in eclipse
	public static void main(String[] args) {
		checkNumber(5);
	}
	//solution of exercise
	public static void checkNumber(int num) {
		if(num>0) {
			System.out.println("positive");
		} else if(num<0) {
			System.out.println("negative");
		} else if(num==0) {
			System.out.println("zero");
		}
		
	}

}
