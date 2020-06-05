package HelloWorld;

class Hi extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++){
		System.out.println("Hi");
		try { Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
class Hello1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++){
		System.out.println("Hello");
		try { Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
public class MultiThread_Threadclass {

	public static void main(String[] args) {
		Hi t1= new Hi();
		Hello1 t2= new Hello1();
		t1.start();
		t2.start();

	}

}
