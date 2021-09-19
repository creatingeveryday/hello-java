import java.util.Scanner;

public class CalendarPrompt {

	
	public void runPrompt() {

		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);

		
		
		while (true) {
			System.out.println("연도를입력하세요.(exit : -1 )");
			System.out.println("YEAR> ");
			int year = sc.nextInt();
			if (year == -1) {
				break;
			}

			System.out.println("달을 입력하세요.");
			System.out.println("MONTH> ");
			int month = sc.nextInt();
			
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			if (month <= 0) {
				continue;
			}

//			System.out.println("첫번째 요일을 입력하세요.(SU MO TU WE TH FR SA)");
//			System.out.println("WEEKDAY> ");
//			String week = sc.next();

			
			
			
			cal.printCalendar(year, month);

		}

		System.out.println("bye~");

		sc.close();
	}

	public static void main(String[] args) {
		CalendarPrompt p = new CalendarPrompt();
		p.runPrompt();

	}

}
