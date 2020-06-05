package HelloWorld;

class Outer{
	int a;
	int b;
	class inner{
		public void show() {
			System.out.println("Good morning");
		}
	}
}
class Outer1{
	static class inner1{   // Outer1$inner1   --- this is the name of the inner class in the folder
		public void print() {
			System.out.println("Good noon");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer obj = new Outer();	// member class
		Outer.inner obj2= obj.new inner();
		obj2.show();
		Outer1 obj3 = new Outer1();
		Outer1.inner1 obj4 =new Outer1.inner1();  //static class
		obj4.print();
	}

}
