
public class GuGuDanExample {

	
	public static void main(String[] args) {
		/*
		 * 	1.				2.			3.			4.		
		 * 	*			*****		*****			
		 *  **			 ****		 ****
		 *  ***			  ***		  ***
		 *  ****		   **		   **
		 *  *****			*			*
		 */
		
		
		// 삼각형 출력하기
	}
	
	public static void main6(String[] args) {
		// 직각삼각형의 각 변의 길이 
		int cnt = 0;
		
		for (int a=1; a<=100; a++) 
			for(int b=1; b<=100; b++)
				for (int c=1; c<=100; c++)
					if (a*a + b*b == c*c) {
						cnt++;
						System.out.printf("[%d,%d,%d]\n", a, b, c);
					} 
		System.out.println("cnt = " + cnt);
	}
	
	public static void main5(String[] args) {
		// 중첩 반복문 
		for (int dan=2; dan<10; dan++) {
			System.out.println( "** " + dan + " 단 **");
			for(int i=1; i<10; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i );
			}
			System.out.println();
		}
	} 
	
	public static void main4(String[] args) {
		
		for (int dan=2; dan<10; dan++) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i );
			}
		}
	}
	
	public static void main3(String[] args) {
		
		int dan = 4;
		for(int i=1; i<10; i++) {
//			System.out.printf("%d X %d = %d\n", 2, i, 2*i );
			System.out.printf("%d X %d = %d\n", dan, i, dan*i );
		}
	}
	
	public static void main2(String[] args) {
		
		for(int i=1; i<10; i++) {
			System.out.println(2*i);
			System.out.println(3*i);
			System.out.println(4*i);
			System.out.println(5*i);
			System.out.println(6*i);
			System.out.println(7*i);
			System.out.println(8*i);
			System.out.println(9*i);
		}
		
	}

}
