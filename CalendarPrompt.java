import java.util.Scanner;

public class CalendarPrompt {
	private final static String PROMPT = "cal> ";

	public void runPrompt() {

		Calendar cal = new Calendar();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.println(PROMPT);
			int month = sc.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			if (month <= 0) {
				continue;
			}

			cal.printCalendar(2021, month);

		}

		System.out.println("bye~");

		sc.close();
	}

	public static void main(String[] args) {
		CalendarPrompt p = new CalendarPrompt();
		p.runPrompt();

	}

}
