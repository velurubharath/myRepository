package ThreadsAndLocks;

public class Example {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadExample1 instance = new ThreadExample1();
		instance.start();
		while(instance.count!=5) {
			try {
				Thread.sleep(250);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Program Completed");
	}
	

}
