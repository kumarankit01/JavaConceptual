package threads;

import java.util.concurrent.BlockingQueue;

public class TaskExecutor implements Runnable {
	BlockingQueue<Runnable> taskQueue ;
	public TaskExecutor(BlockingQueue<Runnable> q) {
		this.taskQueue = q;
	}
	@Override
	public void run() {
		while (true){
			try {
				Runnable r = taskQueue.take();
				r.run();
				System.out.println("Task Started by Thread :" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
