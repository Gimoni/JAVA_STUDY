import java.util.Scanner;

/*
 * 작성자 : 손진희
 * 작성일 : 2023/03/10
 * 교과목 : JAVA
 * 
 */
public class CalenderExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.print("year >> ");
			
			int year = scan.nextInt();
			
			if(year < 1) {
				System.out.println("년도는 AC(서기)입니다.");
				break;
			} 
				
			System.out.print("month >> ");
			
			int month = scan.nextInt();
			
			if (month>12 || month <1) {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
			
			
			
				CalenderExample.printMonth(year, month);	
//				int monthOfDate;
//				CalenderExample.printMonth(monthOfDate);	
				
//				System.out.println("Program End..");
				
		}



		System.out.println("Program End...");
	}

//	private static void leapYear(int year) {
//		
//		boolean leapYear = false;
//		
//		if (year%4==0&&year%100!=0 || year%400==0) {
//			
//		}
//	}
	
	static void printMonth(int year, int month) {
//		long epoch = System.currentTimeMillis() / 1000;

		System.out.printf("%4d년 %2d월\n", year, month);
		
		int [] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31} ;
//		for (int i=1; i<=12; i++) {
//		int dayOfMonth=switch (i) {
//		case 1, 3, 5,7,8,10,12 -> 31;
//		case 4,6,9,11 ->30;
//		case 2 -> {
//			if(year%4==0 && year%100!=0 || year%400==0)
//				yield 29;
//			else 
//				yield 28;
//		}
//		default -> 99;
//		};
//		
//		int secondOfMonth = dayOfMonth*24*60*60; 
//		if (epoch - secondOfMonth >= 0) {
//			epoch -= secondOfMonth;
//			week += dayOfMonth;
//		}else {
//			month = i;
//			break;
//		}
//	}
		
		int dayOfYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 366 : 365;
		
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			dayOfMonth[1] = 29;

		int totalDay = (year-1)*365 + (year-1)/4 -(year-1)/100 + (year-1)/400;
		
		for(int i=0; i<month-1; i++) {
			totalDay += dayOfMonth[i];
		}
		
//		totalDay += 1;
		
		int week = totalDay/7;
		

		char[] weekDay = {'S','M','T','W','T','F','S'};
		
		for (int i=0; i<7; i++) {
			System.out.printf("%4c", weekDay[i]);
		}
			System.out.println("");
		
		
//		for (int i =0; i<week; i++) 
//			System.out.print("    ");
		
		
		for(int i=1; i<dayOfMonth[month-1]; i++) {
			System.out.printf("%4d", i);
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}
		
		if(week/7!=0) {
			System.out.println();
		}
		
	}


}
