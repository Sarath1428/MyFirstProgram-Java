package HelloWorld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class stud implements Comparable<stud>
{
	int Rollno,marks;
	String name;
	public stud(int rollno, int marks, String name) {
		super();
		Rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "stud [Rollno=" + Rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(stud s) {
		return name.length()>s.name.length()?1:-1;
		
	}
	
	
}
public class ComparableInterface {

	public static void main(String[] args) {
		List<stud> values = new ArrayList<stud>();
		values.add(new stud(23,55,"sarath"));
		values.add(new stud(24,95,"kav"));
		values.add(new stud(34,99,"jan"));
		
		Collections.sort(values);
		
		for(stud s: values) {
			System.out.println(s);
		}
		

	}

}
