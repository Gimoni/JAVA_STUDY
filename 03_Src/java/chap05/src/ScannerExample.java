import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.printf("[%4d]", 5);
		System.out.printf("[%4d]\n", 5);
		System.out.printf("%04d", 5);
	}
	
	public static void main2(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("year >> ");
		int year = scan.nextInt();
		
		System.out.println(year + 10);
		
	}

}
