package HelloWorld;
@java.lang.FunctionalInterface
interface sam{
	void show();
	
	
}
public class FunctionalInterface {

	public static void main(String[] args) {
		
		sam obj =() -> System.out.println("i am good");
		obj.show();

	}

}
