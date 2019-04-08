import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltIns {
	
	public static void main(String[] args) {		 
		
		Predicate<String> p = s -> s.startsWith("A");
		
		Function<String, String> f = String::toUpperCase;
		
		System.out.println(p.test("AQUILA"));
		System.out.println(p.test("Boa"));
		
		System.out.println(f.apply("maiuscolo"));		
		
		Arrays.asList("Albero", "Boa", "Camper", "Aquilone")
			.stream()
			.filter(p)
			.map(f)
			.forEach(System.out::println);
	}
}