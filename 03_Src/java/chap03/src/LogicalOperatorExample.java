
public class LogicalOperatorExample {

	public static void main(String[] args) {

//		System.out.println("true && true = " + true && true); 	// error	
// 		The operator && is undefined for the argument type(s) : string, boolean;
		System.out.println("### AND");
		System.out.println("true && true = " + (true && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("false && true = " + (false && true));
		System.out.println("false && false = " + (false && false));
		
		System.out.println("true & true = " + (true & true));
		System.out.println("true & false = " + (true & false));
		System.out.println("false & true = " + (false & true));
		System.out.println("false & false = " + (false & false));
		
		
		System.out.println("### OR");
		System.out.println("true || true = " + (true || true));
		System.out.println("true || false = " + (true || false));
		System.out.println("false || true = " + (false || true));
		System.out.println("false || false = " + (false || false));
		
		System.out.println("true | true = " + (true | true));
		System.out.println("true | false = " + (true | false));
		System.out.println("false | true = " + (false | true));
		System.out.println("false | false = " + (false | false));
		
		
		System.out.println("### XOR");
		System.out.println("true ^ true = " + (true ^ true));
		System.out.println("true ^ false = " + (true ^ false));
		System.out.println("false ^ true = " + (false ^ true));
		System.out.println("false ^ false = " + (false ^ false));
	}

}
