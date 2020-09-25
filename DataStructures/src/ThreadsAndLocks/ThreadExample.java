package ThreadsAndLocks;


//Used Runnable interface
public class ThreadExample implements Runnable{
	public int count=0;
	
	public void  run() {
		System.out.println("Thread Starting");
		try {
			while(count<5) {
				Thread.sleep(500);
				count++;
			}
		}catch(InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
		System.out.println("Thread Terminated");
	}
	
	
	public static void main(String[] args) {
		ThreadExample instance = new ThreadExample();
		Thread thread = new Thread(instance);
		thread.start();
		
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
