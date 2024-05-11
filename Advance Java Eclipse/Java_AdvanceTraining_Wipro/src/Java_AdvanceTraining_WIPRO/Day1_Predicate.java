package Java_AdvanceTraining_WIPRO;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Day1_Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numLst = Arrays.asList(10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20);
		System.out.println("Original List...");
		System.out.println(numLst);
		
		Predicate<Integer> p1 = data -> data %2 == 0;
		 
		List filteredList = numLst.
							stream().
							filter(p1).
							collect(Collectors.toList());
		System.out.println("\nFiltered List...");
		System.out.println(filteredList);
	}

}
