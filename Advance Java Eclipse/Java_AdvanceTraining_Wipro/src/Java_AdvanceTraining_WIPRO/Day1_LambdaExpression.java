package Java_AdvanceTraining_WIPRO;

interface ITest{
	public void display();
}

public class Day1_LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ITest t1 = () -> System.out.println("Displaying information "
				+ "in Lambda....");
		t1.display(); 

	}

}
