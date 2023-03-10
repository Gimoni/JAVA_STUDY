
public class PrintfExample {

	public static void main(String[] args) {
		
		double d = 3.123456712345671234567;
		
		System.out.println(d);					// 3.1234567123456713
		System.out.printf("%f\n", d);			// 3.123457
		System.out.printf("%.20f\n", d);		// 3.12345671234567130000
		System.out.printf("%.4f\n", d);			// 3.1235 소수 반올림 처리함
		
		System.out.printf("%10.4f\n", d);			// 3.1235 		
		System.out.printf("[%10.4f]\n", d);			// [    3.1235]
		System.out.printf("[%-10.4f]\n", d);			// [3.1235    ]		
		System.out.printf("[%010.4f]\n", d);			// [00003.1235]		
		
		
		String str = "Hello";
		System.out.println(str);					// Hello
		System.out.printf("%s\n", str);				// Hello
		System.out.printf("[%10s]\n", str);			// [     Hello]
		System.out.printf("[%-10s]\n", str);			// [Hello     ]
		
		char ch = 'A';
		System.out.printf("[%c, %d, 0x%x, 0%o]\n", ch, (int)ch, (int)ch, (int)ch);
		// [A, 65, 0x41, 0101]
		
	}
	public static void main4(String[] args) {
		int num = 100;
		
		System.out.printf("%d\n", num);				//100
		System.out.printf("%+d\n", num);			//+100
		System.out.printf("%5d\n", num);			//  100
		System.out.printf("[%5d]\n", num);			//[  100]
		System.out.printf("[%05d]\n", num);			//[00100]
		System.out.printf("[%-5d]\n", num);			//[100  ]
		
		
	}
	
	public static void main3(String[] args) {
		/*
		 * 포멧 지정자  
		 * printf 
		 */
		
		int num = 100;
		
		System.out.printf("num = %d\n", num);		// %d 는 변환문자와 d정수를 뜻한다 num = 100

		char ch = 49;
		
		System.out.printf("%c\n", ch);		// %c = char로 인식 	1
		System.out.printf("[%c]\n", ch);		// %c = char로 인식	[1]
		System.out.printf("[%c, %d]\n", ch, (int)ch);		// [1, 49]
		
		char ch2 = 'A';
		System.out.printf("[%c, %d]\n", ch2, (int)ch2);						//	[A, 65]
		System.out.printf("[%c, %d, %x]\n", ch2, (int)ch2, (int)ch2);		// [A, 65, 41]
		
		double pi = 3.1415921592159215921592;
		System.out.println(pi);
		
		System.out.printf("%f\n", pi);				// 실수 표기 %f 
		System.out.printf("%.2f\n", pi);			// 소수 둘째자리까지 출력	
		
	
	}
	public static void main2(String[] args) {
		System.out.println("println()은 New Line을 추가한다");
		System.out.println("############################" +"\n");
		
		System.out.print("print()은 New Line을 추가하지 않는다. \n");
		System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		System.out.printf("[%50s]\n" , "printf");
		System.out.printf("[%-50s]\n" , "printf");
		
		// 콘솔 출력 명령어는 println, print, printf가 있다. 
		
	}

}
