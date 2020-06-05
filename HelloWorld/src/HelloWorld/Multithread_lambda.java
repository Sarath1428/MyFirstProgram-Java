package HelloWorld;

public class Multithread_lambda {

	public static void main(String[] args) throws Exception {
		
		Runnable R1 = () -> {
				for (int i=0; i<5;i++) {
					System.out.println("Hi");
					try {Thread.sleep(1000);}catch(Exception e){}
				}
			
			
		};
		Runnable R2 = () -> {
				for (int i=0; i<5;i++) {
					System.out.println("HEllo"+ Thread.currentThread().getPriority());
					try {Thread.sleep(1000);}catch(Exception e){}
				}
			
		};
		
		Thread obj1= new Thread(R1, "helow");
		Thread obj2= new Thread (R2);
		
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		
		obj1.start();
		try {Thread.sleep(10);}catch(Exception e){}
		obj2.start();
		
		
		obj1.join();
		obj2.join();
		System.out.println(obj1.isAlive());
		System.out.println("bye");
	}

}
