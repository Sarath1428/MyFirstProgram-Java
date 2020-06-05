package HelloWorld;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class ListInterface {
	public static void main(String[] args) {
	java.util.List values = new ArrayList();
	values.add(7);
	values.add(8);
	values.add(10);
	values.add(2,5);
	
	System.out.println(values);
	
	for (int i=0;i<values.size();i++) {
		System.out.println(values.get(i));
	}
	
	for (Object e: values) {
		System.out.println(e);
	}
	
}
}
