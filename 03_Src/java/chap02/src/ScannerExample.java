import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("+100"));
//		System.out.println(Integer.parseInt("abc"));	 // error
		
	}
	
	public static void main3(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("num1 >>");
		int num1 = s.nextInt();
	
		System.out.print("num2 >>");
		int num2 = s.nextInt();
		
		int sum = num1 + num2;
		
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		
	}

	public static void main2(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print(">>");
		String line = s.nextLine();
		System.out.printf("[%s]", line);

		System.out.println("Program End...");
	}

}
