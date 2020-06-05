package HelloWorld;

public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[6];
			a[6]=5;
			int i=7;
			int j=0;
			int k=i/j;
			System.out.println("output is" + k);
		}
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.err.println("error");
		}
	
		finally
		{
			System.out.println("byee");
		}
	}

}
