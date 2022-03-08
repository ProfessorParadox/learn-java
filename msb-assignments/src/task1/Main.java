package task1;

/*Use multi threading to build a string, with each character corresponding to running thread*/
/*
import static task1.ThreadColor.ANSI_CYAN;
import static task1.ThreadColor.ANSI_BLUE;
import static task1.ThreadColor.ANSI_GREEN;
import static task1.ThreadColor.ANSI_PURPLE;
import static task1.ThreadColor.ANSI_RESET;
*/

public class Main {

	public static void main(String[] args) {
		BuildString buildstring = new BuildString();
		
		ThreadString t1 = new ThreadString(buildstring);
		t1.setName("test thread");
		t1.start();
		
		/*
		System.out.println("Hello from the main thread!\n");
		ThreadString aThreadString = new ThreadString();
		aThreadString.start();
		System.out.println(buildThreadString("MSBDOCS"));
		System.out.println("\nHello again from the main thread!");
		*/
	}
	
	/*
	public static String buildThreadString(String seed) {
		String target = "";
		for(int i=0; i<seed.length(); i++) {
			new Thread() {
				public void run() {
					System.out.println("<anon thread exe> " + seed);
					//System.out.println("<anon thread exe> " + seed.charAt(i));
					//target = target + seed.charAt(i);
				}
			}.start();
		}
		
		return ("Original String = " + seed + " , Thread String = " + target);
	}
	*/

}

class BuildString {
	public void buildAString(String seed) {
		String target = "";
		
		for(int i=0; i<seed.length(); i++) {
			target = target + seed.charAt(i);
			System.out.println(Thread.currentThread().getName() + " : Original String = " + seed + " , Thread String = " + target);
		}
	}
}

class ThreadString extends Thread {
	private BuildString threadBuildString;
	
	public ThreadString(BuildString buildstring) {
		threadBuildString = buildstring;
	}
	
	public void run() {
		threadBuildString.buildAString("MSBDOCS");
	}
}
