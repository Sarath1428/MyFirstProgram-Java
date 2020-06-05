package HelloWorld;

class A2{
	public void show()
	{
		System.out.println("in A");
	}
}
class B2 extends A2
{
	public void show()
	{
		System.out.println("in B");
	}
}
class C2 extends A2
{
	public void show()
	{
		System.out.println("in c");
	}
}
public class DynamicRuntimeDespatch {

	public static void main(String[] args) {
		A2 obj = new B2(); // runtime polymorphism
		obj.show();
		obj = new C2();
		obj.show();  // dynamic method dispatch

	}

}
