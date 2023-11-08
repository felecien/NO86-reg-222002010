
interface student { //interface student
	
	default void show()
	{

		// Print statement
		System.out.println("university student at gikondo cumpus");
	}//print out
}

interface Interface1 extends student {
}//interface 1


interface Interface2 extends student {
}
//interface2
class TestClass implements Interface1, Interface2 {
	
	public static void main(String args[])
	{
		
		TestClass d = new TestClass();

		// Now calling the function defined in interface 1
		
		d.show();
	}
}
//defoult university student at gikondo cumpus