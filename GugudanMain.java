import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		
		//사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다. 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 방식. 
		Scanner sc = new Scanner(System.in);
		
		//입력한 값을 문자열로 받는다. 
		String input = sc.nextLine();
		System.out.println(input);           //  ex) 8,7
		
		String [] splitedValue = input.split(",");   // 입력된 문자열을 쉼표를 기준으로 분리함. 
		
		int v1 = Integer.parseInt(splitedValue[0]);  // 분리된 문자열을 정수로 변환하여 변수에 저장함. 
		int v2 = Integer.parseInt(splitedValue[1]);
		
		
		for(int i = 2; i < (v1 +1); i++) { 
			int[] result = Gugudan.saveValue(i, v2);   // 입력받은 변수를 활용해서 method의 배열의 크기를 결정하는 2번째 parameter를 추가하여 인자를 받을 수 있게 수정. 
			Gugudan.print(result);
		}
}
}