
public class Main {

	public static void main(String args[]) {

		Frame f = new Frame();

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					long milis = System.currentTimeMillis();
					f.screen.drawAll();
					try {
						int t = (int) (100 - (System.currentTimeMillis() - milis));
						if (t < 0) {
							t = 0;
						}
						Thread.sleep(t);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.start();

	}

}