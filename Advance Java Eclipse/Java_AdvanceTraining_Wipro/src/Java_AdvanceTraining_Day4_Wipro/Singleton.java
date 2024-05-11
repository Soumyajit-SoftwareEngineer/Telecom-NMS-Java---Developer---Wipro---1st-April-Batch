package Java_AdvanceTraining_Day4_Wipro;

class Whatsapp{
	private static Whatsapp whatsappObject = null;
	private Whatsapp() {}
	public static Whatsapp getInstance() {
		if(whatsappObject == null)
			whatsappObject = new Whatsapp();
		return whatsappObject;
	}
}

public class Singleton {

	public static void main(String args []) {
		// TODO Auto-generated method stub
		
		Whatsapp whatsappObjFirstTime = Whatsapp.getInstance();
		System.out.println("Memory location of the object :"+
		                    whatsappObjFirstTime);
		
	}

}
