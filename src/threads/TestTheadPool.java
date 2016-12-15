package threads;

public class TestTheadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPool pool = new ThreadPool(3, 4);
		for (int i = 0; i < 10; i++) {
			try {
				pool.submitTask(new Task(i));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
