package Java_AdvanceTraining_WIPRO;

interface IMaths{
	public int sum(int x, int y);
}

public class Day1_LambdawithArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IMaths m1 = (x,y) -> x + y;
		int x  = 20 , y = 30;
		int result = m1.sum(x, y);
		System.out.println("Result is : " + result); 

	}

}
