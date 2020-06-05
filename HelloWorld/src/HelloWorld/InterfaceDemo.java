package HelloWorld;

interface Writer1
{
	public void write();
}
class pen1 implements Writer1
{
	public void write() {
		System.out.println("i am pen");
	}
}

class pencil1 implements Writer1{
	public void write() {
		System.out.println("i am pencil");
	}
}
class kit {
	public void dosomething(Writer1 p) {
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
	kit obj = new kit();
	Writer1 p = new pen1();
	Writer1 p1 = new pencil1();
	obj.dosomething(p);

	}

}
