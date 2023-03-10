	/*
	 * 자동 타입 변환 
	 * 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 발생
	 * byte < short, char < int < long < float < double 
	 * 순차적으로 큰 타입에 대입될 때 가능 
	 * 
	 */

public class AutoTypeConversionExample {

	public static void main(String[] args) {
		byte b1 = 100;
		byte b2 = 110;
		
		int result1 = b1 + b2;
		int result2 = (int)b1 + (int)b2;
		
		short result3 = (short)(b1 + b2);
		
		float f1 = 10.5f;
		float f2 = 10.6f;
		float f3 = f1 + f2;
		
//		float f4 = f1 + 10.9;		// error // solution :항을 일치시켜야 한다.
									// Type mismatch: cannot convert from double to float
		float f4 = (float)(f1 + 10.9);		// 형 변환 . 
		
	}
	
	public static void main4(String[] args) {
		
		int i1 = 100;
		long l1 = 200;
		float f1 = 300.5f;
		double d1 = 400.5;

		f1 = l1;		
		f1 = i1;
//		f1 = d1; 		// error
		
		d1 = l1;
		d1 = i1;
		d1 = f1;
		
		
		
	}
	
	
	
	public static void main3(String[] args) {
		
		byte b1 = 100;
		short s1 = 3000;
		char c1 = 'A';
		int i1 = 10000;
		long l1 = 20000;
		
		l1 = i1;
		l1 = c1;
		l1 = s1;
		l1 = b1;
		
//		i1 = l1; 		// error 수의 범위상 선언이 되지 않는다 
		i1 = c1;
		i1 = b1;
		
//		s1 = l1;		// error
//		s1 = i1;		// error
//		s1 = c1;		// error
		s1 = b1;
		
//		c1 = l1;		// error
//		c1 = i1;		// error
//		c1 = s1;		// error
//		c1 = b1;		// error
		
//		b1 = l1;		// error
//		b1 = i1;		// error
//		b1 = s1;		// error
//		b1 = c1;		// error
		
		// 수의 범위를 따져서 작성을 해야함 = 자동형변환. 
		
		
		
	}
	
	
	public static void main2(String[] args) {

		byte b1 = 100;
		byte b2 = 120;
		
//		System.out.println("b1 = " + b1);		// b1 = 100
//		System.out.println("b2 = " + b2);		// b2 = 120
		
		b1 = b2; 		
		
		System.out.println("b1 = " + b1);		// b1 = 120
		System.out.println("b2 = " + b2);		// b2 = 120
		
		short s = 200;
//		b1 = s; 			// error 자동타입변환의 오류 
							
							// 양변의 타입이 같아야 한다
		s = b1; 			// 자동 타입변환. 모든 연산자는 연산시 타입을 공통시킨다 
							// left = right (항을 일치시킨다 but left항의 타입이 큰 타입이여야 한다.)

		System.out.println("s = " + b1);
		
	}

}
