import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ToDoList {

	HashMap<String, ArrayList<String>> map = new HashMap<>();
	public String SAVE_FILE = "PlanList.txt";
	
	
	public HashMap<String, ArrayList<String>> saveToDo(Scanner sc) {
		
		System.out.println("[일정 등록] 날짜를 입력하세요.(yyyy-mm-dd)");
		System.out.println("> ");
		String inputKey = sc.next();
		
		sc.nextLine(); // 개행문자 제거용
		System.out.println("일정을 입력하세요.");
		System.out.println("> ");
		String inputValue = sc.nextLine();
		
		saveToMap(inputKey, inputValue);
		
		System.out.println("일정이 등록되었습니다.");
		return map;
	}

	public HashMap<String, ArrayList<String>> saveToMap(String inputKey, String inputValue) {
		ArrayList<String> alList = new ArrayList<>();
		// 기존에 키와 연결된 값이 있다면 기존의 값들을 모두 다시 새로 불러온 다음에 새로운값을 추가하여 map에 저장.
		if (map.containsKey(inputKey)) {
			alList = map.get(inputKey); // 기존에 키를 통해 저장되어있는 값들을 모두 새로 불러온다.
			alList.add(inputValue); // 새로 추가될 값을 array-list에 추가한다.
			map.put(inputKey, alList); // 최종적으로 map에 저장한다.

			// 기존의 키에 없다면 새로 추가된 값만 저장.
		} else {
			alList.add(inputValue); // 새로 추가될 값을 array-list에 담아준다.
			map.put(inputKey, alList); // 새로추가될 값만 map에 저장한다.
		}
		
		FileWriter fw;
		try {
			fw = new FileWriter(SAVE_FILE, true);
			fw.write(inputKey+","+inputValue+"\n");
			fw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
	}

	public void printSavedList(String inputKey, HashMap<String, ArrayList<String>> map) {
		this.map = map;
		if(this.map.containsKey(inputKey)) {
			// 키와 연결된 값들의 리스트의 사이즈를 출력한다.
			System.out.println(this.map.get(inputKey).size() + "개의 일정이 있습니다.");
			
			// 임시 ArrayList 생성 후 map에서 키와 연결된 값을 저장해준후 반복문을 통해 순서대로 출력한다. 
			// 반복문 출력시 리스트에 순서를 정해준다.
			ArrayList<String> savedList = new ArrayList<>();
			savedList.addAll(this.map.get(inputKey));
			for (int i = 0; i < savedList.size(); i++) {
				System.out.println((i + 1) + ". " + savedList.get(i));
			}
		} else {
			System.out.println("일정이 등록되어있지 않습니다.");
		}

	}

	public void searchToDo(Scanner sc , HashMap<String, ArrayList<String>>  map) {
		System.out.println("[일정 검색] 날짜를 입력하세요.");
		System.out.println("> ");
		String inputKey = sc.next();

		printSavedList(inputKey, map);
	}


}
