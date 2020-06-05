package HelloWorld;
@java.lang.FunctionalInterface
interface sar
{
	void abc();
	default void C()
	{
		System.out.println("interface");
	}
}
class sar1 implements sar
{
	public void abc()
	{
		System.out.println("abc");
	}
	public void C()
	{
		System.out.println("impemented c");
	}
}
public class DefaultMethodInheritance {

	public static void main(String[] args) {
		sar1 obj = new sar1();
		obj.abc();
		obj.C();

	}

}
