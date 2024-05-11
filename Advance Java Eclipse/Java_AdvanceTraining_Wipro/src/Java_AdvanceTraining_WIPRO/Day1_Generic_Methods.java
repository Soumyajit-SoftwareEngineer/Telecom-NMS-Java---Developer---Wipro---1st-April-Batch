package Java_AdvanceTraining_WIPRO;

public class Day1_Generic_Methods {
	
	public static <E> void printArray (E[] inputArray) {
		
		System.out.println();
		for (E el: inputArray)
			System.out.print(el + ",");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray = { 1,2,3,4,5};
		Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
		Character[] charArray = {'j','a','v','a'};
		
		printArray(intArray); 
		printArray(doubleArray);
		printArray(charArray);
	}

}
