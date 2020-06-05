package HelloWorld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(707);
		values.add(488);
		values.add(671);
		values.add(2,534);
		
		Comparator<Integer> c = (i,j)->{
				if(i%10>j%10) {
					return 1;
				}
				else {
					return -1;
				}
		};

		Collections.sort(values, c);
		System.out.println(values);
		
	
		for (Integer e: values) {
			System.out.println(e);
		}
		

	}

}
