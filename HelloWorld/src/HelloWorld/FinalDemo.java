package HelloWorld;

final class s1{
	final int i=10;		//constant
	public final void show() {
						
	}
}
class s2 extends  s1  // no one can inherit
{
	public void show()  // no one can override
	{
		System.out.println("s2");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		

	}

}
