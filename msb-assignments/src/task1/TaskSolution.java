package task1;

import java.lang.StringBuffer;

//solved by using Threads

public class TaskSolution {

	public static void main(String[] args) {
		StringBuffer target = new StringBuffer("");
		
		Thread1 t1 = new Thread1();
		t1.setName("Thread-1");
		Thread2 t2 = new Thread2();
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
		/*System.out.println(t1.sbf1);
		target.append(t1.sbf1);
		System.out.println(t2.sbf2);
		target.append(t2.sbf2);
		
		System.out.println(target);*/
				
	}

}

class Thread1 extends Thread {
	StringBuffer sbf1 = new StringBuffer("");
	String word1 = "MSB";
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " : i= " + i + " " + word1);
			sbf1.append(word1);
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
	}
}

class Thread2 extends Thread {
	StringBuffer sbf2 = new StringBuffer("");
	String word2 = "DOCS";
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " : i= " + i + " " + word2);
			sbf2.append(word2);
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}