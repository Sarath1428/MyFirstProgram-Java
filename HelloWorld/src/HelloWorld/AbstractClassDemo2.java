package HelloWorld;

abstract class  Writer
{
public abstract void write();
}

class pen extends Writer
{
	public void write()
	{
		System.out.println("pen");
	}
}

class pencil extends Writer
{
	public void write()
	{
		System.out.println("pencil");
	}
}

public class AbstractClassDemo2 {

	public static void main(String[] args) {
		Writer obj = new pen();
		obj.write();
		

	}

}
