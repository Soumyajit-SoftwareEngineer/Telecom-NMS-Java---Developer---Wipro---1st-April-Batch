package Java_AdvanceTraining_WIPRO;

interface INewMap{
	public void displayDirections();
}

public class Day1_Method_Referencing {
	
	Day1_Method_Referencing(){
		System.out.println("Constructor of the class Test...");
	}
	public void displayGoogleMap() {
	System.out.println("Displaying google map from src to destination..");
	}
	public static void displayGoogleMapsStatic() {
	System.out.println("Displaying google maps from a static method..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day1_Method_Referencing	Day1_Method_ReferencingObj = 
				new Day1_Method_Referencing();
		INewMap IN = Day1_Method_ReferencingObj :: displayGoogleMap;
		IN.displayDirections();
		
	INewMap InStatic = Day1_Method_Referencing::displayGoogleMapsStatic;
	InStatic.displayDirections();
		
		INewMap INCons = Day1_Method_Referencing :: new;
		INCons.displayDirections();
 
	}

}
