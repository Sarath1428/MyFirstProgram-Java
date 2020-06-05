package HelloWorld;

class printer 
{
	public void show (Number i)
	{
		System.out.println(i);
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		printer obj = new printer();
		obj.show(5.5);

	}

}
