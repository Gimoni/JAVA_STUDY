
public class OperatorQuizExample {
	
	// Entry Point (진입점)
	public static void main11(String[] args) {
		System.out.println("Start Program");
		
		/*
		 *  여기에 코드 작성
		 */
		
		System.out.println("End Program...");
	}
	

//	public static void main10(String[] args) {
//		char ch = 'A';
//		
//		char lowerCase = 		?		: ch;
//		
//		System.out.println("ch:" + ch);
//		System.out.println("ch to lowerCase:" + lowerCase);
//	}
//	public static void main9(String[] args) {
//		// 연습문제 [3-9]
//		char ch = 'z';
//		boolean b =  || ;
//				
//				
//	}
	
	
	public static void main8(String[] args) {
		// 연습문제 [3-8]
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		
		char ch = 'A';
		ch = (char) (ch + 2);
		
		double f = 3.0 / 2.0;
		long l =  3000L * 3000L * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = d!=f2;
		
		System.out.println("c=" +c);				// c=30
		System.out.println("ch=" +ch);				// ch =C
		System.out.println("f=" +f);				// f=1.5
		System.out.println("l=" + l);				// 27000000000
		System.out.println("result="+result);		// true
		
		
		
	}
	public static void main7(String[] args) {
		// 연습문제 [3-7]
		int fahrenhit = 100; 
		float celcius = (float)((5/9) * (fahrenhit -32));
		
		System.out.println("fahrenhit: " + fahrenhit);
		System.out.println("Celcius:" +celcius);
		
	}
	
	public static void main6(String[] args) {
		// 연습문제 [3-6]
		int num = 24;
		System.out.println();
	}
	
	public static void main5(String[] args) {
		// 연습문제 [3-5]
		int num = 333;
//		System.out.println(num - num%10 +1 );
		System.out.println(num/ 10*10 +1);
	}
	public static void main4(String[] args) {
		// 연습문제 [3-4]
		int num = 456;
		System.out.println(num + (byte)(num++));
		
	}
	public static void main3(String[] args) {
		// 연습문제 [3-3]
		int num = 10;
		System.out.println(num%2 == 0? "양수" : "음수");
	}
	
	public static void main2(String[] args) {
		// 연습문제 [3-2]
		int numOfApples = 123;			// 사과의 개수
		int sizeOfBucket = 10; 			// 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (int)((double)(numOfApples / sizeOfBucket)); // 모든 사과를 담는데 필요한 바구니의 수 
		
		
		System.out.println("필요한 바구니의 수 : " +numOfBucket );
	}
	
	public static void main1(String[] args) {
		// 연습문제 [3-1]
		int x = 2;
		int y = 5;
		char c = 'A'; 	// 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);					// 6
		System.out.println(y >= 5 || x < 0 && x > 2);		// true
		System.out.println(y += 10 - x++);					// 13
		System.out.println(x+=2);							// 5
		System.out.println( !('A' <= c && c <='z'));		// false
		System.out.println('C'-c);							// 2
		System.out.println('5'-'0');						// 5	
		System.out.println(c + 1);							// 66
		System.out.println(++c);							// B  
		System.out.println(c++);							// B
		System.out.println(c);								// C
		
	}

}
