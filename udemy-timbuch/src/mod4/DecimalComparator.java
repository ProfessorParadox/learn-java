package mod4;

public class DecimalComparator{
    
	public static boolean areEqualByThreeDecimalPlaces(double one,double two){
        
		double oneint = one * 1000;
        double twoint = two * 1000;
        int oint = (int) oneint;
        int tint = (int) twoint;
        System.out.println(oint);
        System.out.println(tint);
        if(oint == tint){
            return true;
        }
        else{
            return false;
        }
    }
}
