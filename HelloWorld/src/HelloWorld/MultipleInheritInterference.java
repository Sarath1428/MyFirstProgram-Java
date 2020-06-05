package HelloWorld;

interface Demo
{
	default public void show()
	{
		System.out.println("In Demo");
	}
}
interface MyDemo
{
	default public void show()
	{
		System.out.println("In MYDemo");
	}

}
class DemoImp implements Demo , MyDemo 
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Demo.super.show();  // used super keyword to remove ambiguity problem
	}
	
}
public class MultipleInheritInterference {

	public static void main(String[] args) {
		Demo obj = new DemoImp();
		obj.show();
	}

}
