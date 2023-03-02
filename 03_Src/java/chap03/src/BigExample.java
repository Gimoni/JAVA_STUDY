import java.math.BigDecimal;
import java.math.BigInteger;

public class BigExample {

	
	public static void main(String[] args) {
		
		BigDecimal a = new BigDecimal("3.111111111111111111111111111111111111111111111");
		BigDecimal b = new BigDecimal("3.111111111111111111111111111111111111111111111");
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		
	}
	public static void main2(String[] args) {

//		long l1 = 100000000000000000000000000000000000000000000000000; 
		// error : The liter --- if type int is out of range.
		long l1 = 9223372036854775807L;
		BigInteger a = new BigInteger("100000000000000000000000000000000000000000000000000");
		BigInteger b = new BigInteger("100000000000000000000000000000000000000000000000000");
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		
	}

}
