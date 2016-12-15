package threads;

public class Task implements Runnable {
	private int number;
	public Task(int i) {
		this.number = i;
	}
	@Override
	public void run() {
		System.out.println("executing task "+number);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
