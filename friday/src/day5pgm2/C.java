package day5pgm2;
class A
{
	public A()
	{
		super();
		int i;
	}
	public A(String s)
	{
		int j;
	}
	public void m1() //superclass/parent/base
	{
		System.out.println("hello everyone");
	}
}
class B extends A //subclass/child/derived
{
	public B()
	{
		super();
		int i;
	}
	public void m1() //
	{
		System.out.println("good mrng");
	}
	public void m1(String s)
	{
		System.out.println(s);
	}
}
class D extends Object
{
	public D()
	{
}
	public void m1() //superclass/parent/base
	{
		System.out.println("hai everyone");
	}
}

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a,a1;
B b;
a = new A("abhi");
a = new A();
//a1 = new A();
b = new B();
a1 = a;
a1.m1();
a1 = b;
b.m1();
a1.m1();
//a1.m2();
D d = new D();
d.m1();
	}

}
