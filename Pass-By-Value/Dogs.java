public class Dogs {
	
	public static void foo(Dog someDog) {  	// the parameter someDog is set to the value 42
		
		someDog.setName("Max");     		// someDog is followed to the Dog it points to (the Dog object at address 42)
											// that Dog (the one at address 42) is asked to change his name to "Max"
		
		someDog = new Dog("Fifi");  		// a new Dog is created. Let's say he's at address 74.
											// we assign the parameter someDog to that address, 74
		
		someDog.setName("Rowlf");			// someDog is followed to the Dog it points to (the Dog object at address 74)
											// that Dog (the one at address 74) is asked to change his name to "Rowlf"
	}
	
	public static void main (String[] args) {
		
		Dog myDog = new Dog("Rover");
		
		foo(myDog);
		
		System.out.println(myDog.getName());	// "Max", not "Rolf"		
	}

}

class Dog {
	
	private String name;
	
	public Dog(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}