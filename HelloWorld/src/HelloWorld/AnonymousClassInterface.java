package HelloWorld;

interface A3
{
	public void show();
}
public class AnonymousClassInterface {

	public static void main(String[] args) {
		A3 obj = new A3()
				{
					public void show() {
						System.out.println("i am the best ");
					}
				};
		obj.show();

	}

}
