
interface I
{
	int x=10;
	void m1();
	void m2();
	void m3();
}

class A impuments I
{
	public void m1()
{
		System.out.println("m1-A");
}
public void m2()
{
		System.out.println("m2-B");
}
public void m3()
{
		System.out.println("m3-C");

}
public void m4()
{
		System.out.println("m4-D");
}
}
class A
{

	public static void main(String[] args) 
	{
	I i=new I();
	System.out.println(i.x);
	System.out.println(I.x);
	System.out.println(A.x);
 i.m1();
 i.m2();
 i.m3();
 System.out.println("-------------");
 A a=new A();
 System.out.println(a.x);
 a.m1();
 a.m2();
 a.m3();
 a.m4();
	}
}
