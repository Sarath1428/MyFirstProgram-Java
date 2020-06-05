package HelloWorld;

public class WrapperClass {

	public static void main(String[] args) {
		int i = 5; // primitive data type
		Integer ii = new Integer(i); // Boxing : primitive date type into wrapper class
		int j = ii.intValue(); // un boxing
		System.out.println(j);
		
		Integer i1= i; // auto boxing
		int k=i1;  // auto un-boxing
		
		System.out.println(i1);
		
		String s= "123";
		int A = Integer.parseInt(s);
		System.out.println(s);
		

	}

}
