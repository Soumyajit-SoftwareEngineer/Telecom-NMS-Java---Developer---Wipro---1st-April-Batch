package Java_AdvanceTraining_Day3_Wipro;

import org.junit.Test;

public class Junit_Suites {
		
		public int Junit_Suites(int x, int y) {
			return x * y;
		}
		
		public void Junit_Suites() {
			Junit_Suites testObj = new Junit_Suites();
			int x =  20, y = 3, finalResult = 60;
			
			int functionResult = testObj.Junit_Suites(x, y);
			assertEquals (finalResult, functionResult);
		}

		private void assertEquals(int finalResult, int functionResult) {
			// TODO Auto-generated method stub
			
		}

	}


