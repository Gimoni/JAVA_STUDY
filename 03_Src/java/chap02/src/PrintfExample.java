
public class PrintfExample {

	public static void main(String[] args) {
		System.out.println("println()은 New Line을 추가한다");
		System.out.println("############################" +"\n");
		
		System.out.print("print()은 New Line을 추가하지 않는다. \n");
		System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		System.out.printf("[%50s]\n" , "printf");
		System.out.printf("[%-50s]\n" , "printf");
		
		// 콘솔 출력 명령어는 println, print, printf가 있다. 
		
	}

}