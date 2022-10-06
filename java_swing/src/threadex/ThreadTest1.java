package threadex;

public class ThreadTest1 {
//main thread
	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			System.out.println("-");
		
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
