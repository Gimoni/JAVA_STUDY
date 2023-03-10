
public class EscapeExample {

	public static void main(String[] args) {
		//VT100 명령어 사용해보기
		System.out.printf("\033[2J");	// \033[2 : clear screen : at terminal
										// console 제어문자 (\033 =esc키)
		
		System.out.print("\033[10;20H"); // causer move : at terminal
		System.out.print("\033[31m");		// fg red
		System.out.print("\033[44m");		// bg blue
		System.out.print("Hello");
										
		System.out.print("\033[5;10H");	// causer move
		System.out.print("\033[34m");		// fg blue
		System.out.print("\033[41m");		// bg red
		System.out.print("World!");		
		
		System.out.print("\033[0m");		// reset color
	}

}
