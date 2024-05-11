package Java_AdvanceTraining_Day4_Wipro;

//Base class Animal
	class Animal {
	    // Method speak to be overridden by subclasses
	    public void speak() {
	        System.out.println("Animal speaks");
	    }
	}
	// Subclass Dog
	class Dog extends Animal {
	    // Override speak method
	    public void speak() {
	        System.out.println("Woof!");
	    }
	}

	// Subclass Cat
	class Cat extends Animal {
	    // Override speak method
	    public void speak() {
	        System.out.println("Meow!");
	    }
	}

	

public class Executed_RunTime_Polymorphism {
	
	public static void makeAnimalSpeak(Animal animal) {
		animal.speak();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal Dog = new Dog();
		Animal Cat = new Cat();
		
		makeAnimalSpeak(Dog);
		makeAnimalSpeak(Cat);

        
	}

}


