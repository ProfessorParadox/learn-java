package task1;

public class TaskSolution {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setName("Thread-1");
		Thread2 t2 = new Thread2();
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
	}

}

class Thread1 extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " : i= " + i + " MSB");
			//try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " : i= " + i + " DOCS");
			//try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}