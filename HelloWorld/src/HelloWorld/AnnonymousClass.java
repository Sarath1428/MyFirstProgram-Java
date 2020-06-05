package HelloWorld;

class A4
{
	public void show()
	{
		System.out.println("....");
	}
}
public class AnnonymousClass {

	public static void main(String[] args) {
	
		A4 obj = new A4()
				{
				public void show()
				{
					System.out.println("..................");
				}
				};
		obj.show();

	}

}
