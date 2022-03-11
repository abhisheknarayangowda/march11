package day5pgm3;

public class MethodOverloading {

	public static void main(String[] args) {
		applicationForm("abhi",879268323,8);
		applicationForm("abhi",9535876015L,9900952385L,8);

	}
	static void applicationForm(String name, int number, int age)
	{
		System.out.println("----Method----");
		System.out.printf("the name is %s", name).println();
		System.out.printf("the mobile number is %d", number).println();
		System.out.printf("the age is %d \n", age).println();
	}
	static void applicationForm(String name, long number, long number2,int age)
	{
		System.out.println("----Method Overloading----");
		System.out.printf("the name is %s", name).println();
		System.out.printf("the mobile number is %d", number).println();
		System.out.printf("the mobile number2 is %d", number).println();
		System.out.printf("the age is %d", age).println();
	}
	}


