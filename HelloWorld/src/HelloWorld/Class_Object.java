package HelloWorld;

class cal{
	int num1;
	int num2;
	int result;
	
	public void perform() {
		result = num1+num2;
		
	}
}
public class Class_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal obj = new cal(); // knows something and does something  obj is the reference
		obj.num1=5;
		obj.num2=4;
		obj.perform();
		System.out.println(obj.result);
	}

}
