package task1;

//solved by using Runnable

public class TaskSolutionFinal implements Runnable{
	StringBuffer target;
		
	public TaskSolutionFinal(String targetPiece) {
		this.target = new StringBuffer(targetPiece);
	}
	
		
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			target.append(Thread.currentThread().getName() + " ");
			try { Thread.sleep(200); } catch(Exception e) {}
		}
	}



	public static void main(String[] args) {
		String word = "";
		TaskSolutionFinal targetObject = new TaskSolutionFinal(word);
		Thread t1 = new Thread(targetObject);
		t1.setName("MSB");
		Thread t2 = new Thread(targetObject);
		t2.setName("DOCS");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch(Exception e) {}
		
		System.out.println(targetObject.target);
	}


}
