package HelloWorld;

class A1{
	public void show() {
		System.out.println("in A1");
	}
}
class B1 extends A1
{
	
	public void show() {
		System.out.println("in B1"); // method overriding
	}
}
public class methodOverride {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.show();

	}

}
