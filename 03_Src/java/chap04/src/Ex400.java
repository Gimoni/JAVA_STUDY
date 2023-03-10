	/*
	 * Control Statements Example Quiz
	 */
public class Ex400 {
	
//	1. int x 10 20 true 형 변수 가 보다 크고 보다 작을 때 인 조건식
//	2. char ch true 형 변수 가 공백이나 탭이 아닐 때 인 조건식
//	3. char ch ‘x' ’X' true 형 변수 가 또는 일 때 인 조건식
//	4. char ch 형 변수 가 숫자(‘0’~‘9’)일 때 인 조건식 true
//	5. char ch ( ) true 형 변수 가 영문자 대문자 또는 소문자 일 때 인 조건식
//	6. int year 400 4 100 형 변수 가 으로 나눠떨어지거나 또는 로 나눠떨어지고 으로 나눠떨어지지
//	않을 때 인 조건식 true
//	7. boolean powerOn false true 형 변수 가 일 때 인 조건식
//	8. str “yes” true 문자열 참조변수 이 일 때 인 조건식
	
	
	
	
	public static void main(String[] args) {
		// 윤년 평년 확인하는 공식... 
		// int year = 1992 ;
		int year = (int)(Math.random()*2030 + 1);
		
		System.out.println(year%4==0 && year%100!=0 || year%400==0); 
		
		if (year%4==0 && year%100!=0 || year%400==0)
			System.out.println(year + " = 윤년");
		else
			System.out.println(year + " = 평년");
		
	}
	
	public static void main6(String[] args) {
		char ch = 'f';
		System.out.println((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'));
//		System.out.println(ch>='a' && ch<='z' || ch>='A' && ch<='Z');
		
		if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println("문자 알파벳입니다.");
	}
	
	public static void main5(String[] args) {
		char ch = '9';
		System.out.println(ch >= '0' && ch <= '9' );
		
		if (ch >= '0' && ch >= '9')
			System.out.println("문자로서 숫자인 0~9까지의 숫자입니다.");
	}
	
	public static void main4(String[] args) {
		char ch = 'x';
		System.out.println(ch== 'x' || ch== 'X');
		
		if (ch== 'x' || ch== 'X')
			System.out.println("소문자 x 또는 대문자 X입니다.");
	}
	
	public static void main3(String[] args) {
		char ch = 'A';
		System.out.println (!( ch== ' ' || ch== '\t'));
		
		if(!( ch== ' ' || ch== '\t'))
			System.out.println("공백이나 탭이 아닙니다.");
	}
	
	public static void main2(String[] args) {
		int x = 15;
		System.out.println( x > 10 && x < 20);
		
		if (10 < x && x <20)
			System.out.println("참입니다.");
		
	}

}
