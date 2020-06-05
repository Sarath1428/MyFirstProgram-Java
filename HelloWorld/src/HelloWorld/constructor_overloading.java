package HelloWorld;

class casio11{
	int num1,num2;
	public casio11() {
		System.out.println("Hi everyone");
	}
	public casio11(int i, int j) {
		num1 = i;
		num2= j;
		System.out.println(i);
		System.out.println(j);
		System.out.println("Hi everyone");
	}
	
	
}
public class constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		casio11 obj=new casio11();
		casio11 obj1=new casio11(5,4);
	}

}
