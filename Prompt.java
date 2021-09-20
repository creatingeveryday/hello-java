import java.util.ArrayList;
import java.util.Scanner;

public class Prompt {

	public void printMenu() {
		ArrayList<String> info = new ArrayList<>();

		info.add("일정 등록");
		info.add("일정 검색");
		info.add("달력 보기");
		info.add("도움말");
		info.add("종료");

		System.out.printf("%s", "+--------------------+\n");
		System.out.printf("| 1. %s\n", info.get(0));
		System.out.printf("| 2. %s\n", info.get(1));
		System.out.printf("| 3. %s\n", info.get(2));
		System.out.printf("| h. %s q. %s\n", info.get(3), info.get(4));
		System.out.printf("%s", "+--------------------+\n");
	}

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		ToDoList todo = new ToDoList();
		Calendar cal = new Calendar();

		while (true) {
			printMenu();
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.println("> ");
			String inputCommend = sc.next();

			if (inputCommend.equals("1")) {
				todo.saveToDo(sc);
			} else if (inputCommend.equals("2")) {
				todo.searchToDo(sc);
			} else if (inputCommend.equals("3")) {
				printCalendar(sc, cal);
			} else if (inputCommend.equals("h")) {
				printMenu();
			} else if (inputCommend.equals("q")) {
				System.out.println("Bye");
				break;
			}

		}

		sc.close();
	}

	public void printCalendar(Scanner sc, Calendar cal) { // Scanner parameter로 넘겨받음.
		System.out.println("연도를입력하세요.");
		System.out.println("YEAR> ");
		int year = sc.nextInt();

		System.out.println("달을 입력하세요.");
		System.out.println("MONTH> ");
		int month = sc.nextInt();

		if (month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}

		cal.printCalendar(year, month);

	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt(); // 클래스로 분리후에 어떻게 연결시켜실행하지?

	}

}
