
public class VT100Example {

	public static void main(String[] args) {
        System.out.print("\033[2J");        // 1. Clear Screen
        System.out.print("\033[10;10H");    // 2. Cursor Move
        System.out.print("\033[31m");       // 3. Foreground Color
        System.out.print("\033[44m");       // 4. Background Color
        System.out.print("Hello VT100!");
        System.out.print("\033[0m");        // 5. Reset Color
        
        // 실행 : at cmd : java VT100Example
	}

}
