package HelloWorld;

class A{
	public A() {
		System.out.println("in A");
	}
	public A(int i) {
		System.out.println("in A int");
	}
}

class B extends A
{
	public B() {
		super(5); // by default it will call super class constructor
		System.out.println("in B");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		B obj1 = new B();
		

	}

}
