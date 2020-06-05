package HelloWorld;

class Cal1{
	int num1;
	int num2;
	
	public Cal1() {
		int num1=5;
		int num2=6;
		System.out.println(num1);
	}
	
	public Cal1(int k)
	{
		num1=k;
		System.out.println(num1);
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal1 obj1=new Cal1();  // default constructor
		Cal1 obj = new Cal1(8);   // parameterized constructor
		System.out.println(obj.num1);
	}

}
