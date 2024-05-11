package Java_AdvanceTraining_Day4_Wipro;

import java.util.Scanner;
import java.lang.NullPointerException;

abstract class Plan1{
	double ratePerUnit;
	abstract void getRate();
	public void calculateBill (int units) {
	System.out.println("Consumer has to pay Rs."+units+ratePerUnit);
	}
}

	abstract class DomesticPlan1 extends Plan1{  
		public void getRate() {
			ratePerUnit = 3.50;
		}
	}
	
	class InstitutionPlan1 extends Plan1{
		public void getRate() {
			ratePerUnit = 5.50;
		}
	}
	
	class CommercialPlan1 extends Plan1{
		public void getRate() {
			ratePerUnit = 7.50;
		}
	}
	
	class GetPlanFactory1{
		public Plan1 getPlan(String planType) {
			if(planType.equals("Domestic"))
				return new InstitutionPlan1();
			 if(planType.equals("Institution"))
				return new InstitutionPlan1();
			else if(planType.equals("Commercial"))
				return new CommercialPlan1();
			return null;
		}
	}

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println
("Enter the type of building : (Domestic/Institution/Commercial)");
			String strBuildingType = sc.next();
			
		GetPlanFactory1 planFactory = new GetPlanFactory1();
		Plan1 pln = planFactory.getPlan(strBuildingType);
		
		System.out.println("How many units of consumed...");
		int iUnits = sc.nextInt();
		pln.getRate();
		
		System.out.println("Rate per Unit for"+ strBuildingType
				+"is Rs.:"+pln.ratePerUnit);
		pln.calculateBill(iUnits);

	}

}
