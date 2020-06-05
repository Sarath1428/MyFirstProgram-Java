package HelloWorld;

class Hi implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++){
		System.out.println("Hi");
		try { Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
class Hello1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++){
		System.out.println("Hello");
		try { Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
public class RunnableInterface {

	public static void main(String[] args) {
		Hi t1= new Hi();
		Hello1 t2= new Hello1();
		
		Thread obj1 = new Thread(t1);
		Thread obj2 = new Thread(t2);
		obj1.start();
		try { Thread.sleep(10);}catch(Exception e) {}
		obj2.start();

	}

}
