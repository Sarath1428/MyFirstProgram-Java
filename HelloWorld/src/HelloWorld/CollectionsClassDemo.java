package HelloWorld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(7);
		values.add(8);
		values.add(10);
		values.add(2,5);
		Collections.sort(values);
		System.out.println(values);
		
	
		for (Integer e: values) {
			System.out.println(e);
		}
		

	}

}
