package HelloWorld;

class stu
{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public interface EncapsulationDemo {
	public static void main(String[] args) {
		stu obj = new stu();
		obj.setRollno(3);
		System.out.println(obj.getRollno());
		obj.setName("sarath");
		System.out.println(obj.getName());
}
}
