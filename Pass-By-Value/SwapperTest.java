
/*
 * Litmus Test
 * 
 * There's a simple "litmus test" for whether a language supports pass-by-reference semantics:
 * 
 * Can you write a traditional swap(a,b) method/function in the language? * 
 */

public class SwapperTest {
	
	static void swap(String a, String b) {
		
		String temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		
		String a = "Prima";
		String b = "Seconda";
		
		swap(a,b);
		
		System.out.println(a);	// "Prima"
		System.out.println(b);	// "Seconda"
	}
}