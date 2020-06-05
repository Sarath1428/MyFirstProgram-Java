package HelloWorld;

public class Continue_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Break and continue
		
		for (int i=0;i<10;i++) {
			if(i==6) {
				break;
					
			}
			System.out.println("Hello " + i);
		}
		for (int j=0;j<10;j++) {
			if(j==6) {
				continue;	
			}
			System.out.println("chl " + j);
		}
	}
	

}
