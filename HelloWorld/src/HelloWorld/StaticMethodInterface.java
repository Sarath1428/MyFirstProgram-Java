package HelloWorld;
interface Demo1
{
	int i= 8;			// in we define a variable inside interface it will become constant
	
	static void show()
	{
		System.out.println("demo 1");
	}
}
public class StaticMethodInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1.show();
	}

}
