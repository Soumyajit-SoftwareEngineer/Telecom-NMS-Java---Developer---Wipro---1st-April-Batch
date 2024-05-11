package JUnit_Annotations;


	import org.junit.Assert.assertEquals;
	import org.junit.After;
	import org.junit. AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;

	public class Annotations {

		public static void main(String[] args) {
			// TODO Auto-generated method stub				
		}	
		int sum (int x, int y) { 
			return x + y;
		}
		//Verifies whether the given user is a valid user or not.
		String login (String uid, String pwd) {
		if (uid.equals("Soumya") && pwd.equals("admin"))
		return "Valid User";
		else
		return "Invalid User";
	}
		 public static void beforeClassFunc() {
		System.out.println("Connecting to the database...beforeClass...");
		 }
		//Before every test case this function is executed.
		public void beforeFunction () {
		System.out.println("\nBefore the actual method is executed..");
		}
		//after every test case, this function is executed..
		public void afterFunction() {
		System.out.println("After the code is executed...");
		}
		@Test
		public void testSum() {
			Annotations testobj = new Annotations();
			int x = 20, y = 30, iResult = 50;
			System.out.println("Executed the sum()..");
			int result = testobj.sum(x, y);
			assertEquals (iResult, result);
			}
			
			public void testLogin() {
				Annotations testobj = new Annotations();
			String uid = "Soumya";
			String pwd = "admin";
			System.out.println("Executed the login()..");
			String strResult = testobj.login(uid, pwd);
			assertEquals ("Valid User", strResult);
	}
			
			public static void afterClassFunction() {
				System.out.println("Database connection is released...afterClass..");
			}
			}