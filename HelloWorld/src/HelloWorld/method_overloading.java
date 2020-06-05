package HelloWorld;

class casio{
	public void add(int i, int j) {
		System.out.println(i+j);
		
	}
	public void add(int i, int j,int k) {
		System.out.println(i+j+k);
		
	}
	public void add(double i, double j) {
		System.out.println(i+j);
		
	}
}

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		casio obj = new casio();
		obj.add(4, 5);
		obj.add(4, 5, 9);
		obj.add(4.5, 4.5);
	}

}
