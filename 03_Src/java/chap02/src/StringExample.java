
public class StringExample {
	/*
	 * 타입
	 * 1. Primitive Type (기본타입, 원시타입) - 8EA
	 * 		- 정수 : byte, short, char, int, long
	 * 		- 실수 : float, double 
	 * 		- 논리 : boolean
	 * 
	 * 2. Reference Type (참조타입) - N개
	 * 		- String 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String str1 = "Hello world";
		String str2 = "대한민국";
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = " \"특수문자 사용 이스케이프\" ";	
		// 특수문자 사용시 역슬래시 사용 \ 
		// white space : tab , space, new line
		//  이스케이프 문자 : 문자열 내부에 역슬래스(\)가 붙은 문자 
		// 
		System.out.println(str3);
		
		String str4 = "\\\\";
		String str5 = "\\";				// escape character .. 
		System.out.println(str4);
		System.out.println(str5);
		
		String str6 = "[ ] [\t]";		// tab
		System.out.println(str6);
		
		String str7 = "[\n]";			// new line
		System.out.println(str7);
		
		
		
	}
}