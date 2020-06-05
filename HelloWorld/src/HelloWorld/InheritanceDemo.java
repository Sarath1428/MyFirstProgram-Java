package HelloWorld;

class Cal3{						//super
	
	public int add(int i,int j) {
		return i+j;	
	}
}

class Cal2 extends Cal3{			//sub
	public int sub(int i,int j) {
		return i-j;
		
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Cal2 obj = new Cal2();
		System.out.println(obj.add(4, 5));
		System.out.println(obj.sub(5, 1));
		

	}

}
