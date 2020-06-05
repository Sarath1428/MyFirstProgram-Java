package HelloWorld;

class h1
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
public class Synchronized_multithread {

	public static void main(String[] args) throws Exception {
		h1 a1 = new h1();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i=1;i<=1000;i++) {
					a1.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i=1;i<=1000;i++) {
					a1.increment();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(a1.count);
	}

}
