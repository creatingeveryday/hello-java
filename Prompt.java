import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;



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
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		HashMap<String, ArrayList<String>> tempMap = new HashMap<>();
		ArrayList<String> alList = new ArrayList<>();
		
		File f = new File(todo.SAVE_FILE);
		if(!f.exists()) {
			sc.close();
			System.out.println("저장된 일정파일이 존재하지 않습니다.");
			return;
		}
		try {
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				String line = s.nextLine();
				String[] words = line.split(",");
				String temp = words[1];
				
				if(map.containsKey(words[0])) {
					alList = map.get(words[0]);
					alList.add(temp);
					map.put(words[0], alList);
				}else {
					//키값이 없을때 새롭게 임시배열 생성후 load to map 
					ArrayList<String> templist = new ArrayList<>();
					templist.add(temp); // 새로 추가될 값을 array-list에 담아준다.
					map.put(words[0], templist); // 새로추가될 값만 map에 저장한다.
				}
				
			}
			if(s.hasNext()) {
				System.out.println("저장된 일정이 존재하지 않습니다.");
			}
			s.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		boolean isLoop = true;
		while (isLoop) {
			printMenu();
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.println("> ");
			String inputCommend = sc.next();

			switch (inputCommend) {
			case "1":
				tempMap = todo.saveToDo(sc);   
				//기존의 map에 새로 저장한 일정을 저장한다. 
				Set<String> keys = tempMap.keySet();
				Object[] ka = keys.toArray();   //키셋을 배열로 변환
				
				for(int i = 0; i <keys.size();i++) {
					map.put((String) ka[i], tempMap.get(ka[i]));
				}
				
				break;
			case "2":
				todo.searchToDo(sc, map);
				break;
			case "3":
				printCalendar(sc, cal);
				break;
			case "h":
				printMenu();
				break;
			case "q":
				isLoop = false;
				break;
			default:
				System.out.println("올바른 명령을 입력해주세요.");
				break;
			}

		}
		System.out.println("종료되었습니다.");
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
		p.runPrompt();
	}
	
	
}

	


