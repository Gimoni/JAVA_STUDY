import java.time.LocalDate;

public class DateExample {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(1, 1, 1);
		LocalDate d2 = LocalDate.of(2, 1, 1);
		
		System.out.println(d1 + ", " + d1.getDayOfWeek());
		System.out.println(d2 + ", " + d2.getDayOfWeek());
		
		
	}
}
