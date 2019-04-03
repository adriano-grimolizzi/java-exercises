/* 
 * A functional interface is an interface that contains only one abstract method.
 *  
 * public interface Runnable {
 *     public abstract void run();
 * }
 * 
 * https://www.geeksforgeeks.org/functional-interfaces-java/
 */

public class FunctionalInterfaces {

	public static void main(String... args) {

		/*
		 * Before Java 8, an anonymous inner class had to be created.
		 */

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous Inner Class!");
			}
		}).start();

		/*
		 * From Java 8 onwards, it is possible to assign a lambda expression to its
		 * functional interface object:
		 */

		new Thread(() -> System.out.println("Lambda Expression!")).start();

		/*
		 * @FunctionalInterface annotation is used to ensure that the functional
		 * interface can't have more than one abstract method. If more than one abstract
		 * methods are present, the compiler flags a 'Unexpected @FunctionalInterface
		 * annotation' message. It's not mandatory to use this expression.
		 */
		
		Greeter greeter = (String greeting) -> System.out.println(greeting);
		
		greeter.greet("Functional Interface Annotation!");
	}

	@FunctionalInterface
	interface Greeter {
		void greet(String greeting);
	}
}