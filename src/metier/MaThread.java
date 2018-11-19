package metier;

public class MaThread implements Runnable {

	// Constructeur
	public MaThread(long time) throws InterruptedException {	
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	
	@Override
	public void run() {
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("Ma thread " + i);
			try {
				Thread.sleep(500);
			} catch (java.lang.InterruptedException e) {
				System.out.println("Interrupted !");
			}
		}

		System.out.println("Ma thread se termine");

	}

}