
public class LanguageExample {

	public static void main(String[] args) {
		System.out.print("\033[2J");
		
		System.out.print("\033[28;25H");	
		System.out.print("\033[32m");		// fg green
		System.out.print("\033[47m");		// bg white
		System.out.print("java");
		
		System.out.print("\033[40;8H");	
		System.out.print("\033[30m");		// fg black
		System.out.print("\033[43m");		// bg yellow
		System.out.print("HTML");	
		
		System.out.print("\033[15;15H");	
		System.out.print("\033[37m");		// fg white
		System.out.print("\033[44m");		// bg blue
		System.out.print("Python");	
		
		System.out.print("\033[24;35H");	
		System.out.print("\033[33m");		// fg yellow
		System.out.print("\033[42m");		// bg green
		System.out.print("CSS");	
		
		System.out.print("\033[0m");
		
	}

}
