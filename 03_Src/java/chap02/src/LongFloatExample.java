
public class LongFloatExample {

	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE); 
		// 최대19자리 = 9223372036854775807
		System.out.println(Float.MAX_VALUE); 
		// 3.4028235E38 =3.4 * 38승 까지 표현가능
		System.out.println(Double.MAX_VALUE);
		// 1.7976931348623157E308 = 
		
		/**
		 Long <  Float < Double 
		 실수는 유효자리수까지만 표현이 되면 
		 그 이상의 값으로 넘어가면 정확한 값이 아닌 근사치가 저장됨.
		
		**/ 
		
		long l1 = 1234567890123456789L;
		
		float f1 = l1;
		
		System.out.println("#########");
		System.out.println(l1); //1234567890123456789
		System.out.println(f1); //1.23456794E18
		
		long l2 = (long)f1;
		System.out.println(l2); //1234567939550609408
		
	}

}
