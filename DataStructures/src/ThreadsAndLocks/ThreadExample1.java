package ThreadsAndLocks;

public class ThreadExample1 extends Thread {
public int count=0;
	
//For threads, Implements is always preferred instead of extends.
//As a class can extend only one other class
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
	
}
