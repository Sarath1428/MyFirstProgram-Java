package HelloWorld;


class clas{
	
	public int add (int ... n) {  // variable argument length
		int sum = 0;
		for(int k: n) {
			sum = k + sum;	
		}
		return sum ; 
		
	}
}
public class VarArgs {

	public static void main(String[] args) {
		clas obj1 = new clas();
		System.out.println(obj1.add(2,3,4,1));

	}

}
