package HelloWorld;



class Student{
	int eid;
	int name;
	static String principal;
	
	static{
		principal = "sarath";
		System.out.println(" in static block");
	}
	
	public void show() {
		System.out.println(eid + " " + name + " " + principal);
	}
	
}

public class Static_Demo {

	public static void main(String[] args) {
		Student st = new Student();
		st.eid= 12;
		st.name=123;
		st.show();
		Student st2= new Student();
		st2.eid=34;
		st2.name= 56;
		st2.show();
		
	}

}
