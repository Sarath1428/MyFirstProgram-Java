package HelloWorld;

 class One{
	int num1,num2;			//instance variable
	public One(int num1,int num2)// local variable
	{
		this.num1=num1;
		this.num2=num2;
	}
}
public class This_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One obj = new One(4,5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
