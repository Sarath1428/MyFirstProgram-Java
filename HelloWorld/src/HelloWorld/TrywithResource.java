package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrywithResource {

	public static void main(String[] args) throws Exception {
		
		int n=0;
		System.out.println("enter the number");
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			n= Integer.parseInt(br.readLine());
		}

	}

}
