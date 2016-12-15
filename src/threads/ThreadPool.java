package threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadPool {
	BlockingQueue<Runnable> taskQueue;
	public	ThreadPool(int qSize,int nThread){
		taskQueue = new LinkedBlockingDeque<>(qSize);
		TaskExecutor taskExecutor = new TaskExecutor(taskQueue);
		for (int i = 0; i < nThread; i++) {
			Thread t = new Thread(taskExecutor, "Thread"+i);
			t.start();
		}
	}
	public void submitTask(Runnable r) throws InterruptedException{
		taskQueue.put(r);
	}
}
