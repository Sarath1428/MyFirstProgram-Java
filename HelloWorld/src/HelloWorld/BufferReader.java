package HelloWorld;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws Exception {
		System.out.println("enter the value");
		InputStreamReader br = new InputStreamReader(System.in);
		BufferedReader f = new BufferedReader(br);
		
		int n = Integer.parseInt(f.readLine());
		System.out.println(n);

	}

}
