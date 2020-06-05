package HelloWorld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo_Iterator {

	public static void main(String[] args) {
		
		Collection values = new ArrayList();
		values.add(7);
		values.add(8);
		values.add(10);
		
		System.out.println(values);
		
		Iterator it = values.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
