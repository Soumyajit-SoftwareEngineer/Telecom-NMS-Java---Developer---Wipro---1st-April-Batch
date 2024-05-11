package Java_AdvanceTraining_Day4_Wipro;

 class Test{
public void method() {
	System.out.println("Method1");
}
}


public class RunTime_Polymorphism{

	private static final Test test = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test = new Test();
		test.method();
		
	}

}
