
public class OverflowExample {

	
	public static void main(String[] args) {
		long l = Long.MAX_VALUE;
		
		System.out.println(l);
		
		l++;
		
		System.out.println(l);
		
	}
	
	public static void main4(String[] args) {
		int i = Integer.MAX_VALUE;
		
		System.out.println(i);
		
//		i++; 
		i = i + 100;
		
		System.out.println(i);
		
		
		
		System.out.println("Program End...");
	}
	
	
	
	public static void main3(String[] args) {
		short s = Short.MAX_VALUE;
		
		System.out.println(s);
		
		s++; 			//overflow;
		
		System.out.println(s);
		
		System.out.println("End...");
	}
	
	public static void main2(String[] args) {
		byte b = 126;
		
		b++;
		
		System.out.println(b); // 127
		
		b++;
		
		System.out.println(b); // -128 ? cuz after max,  it goes overflow // (-128 ~ 127) 
								// at the byte , after 127 it cant go to 128 so it goes to -128
		
		b++;
		
		System.out.println(b); // -127

	}

}
