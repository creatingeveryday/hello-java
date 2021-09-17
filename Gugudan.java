import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
				//2단 단순반복 : 시간이 많이 걸림. 재사용성 낮음. 
		
				System.out.println("2단");
				
				System.out.println(2 * 1);
				System.out.println(2 * 2);
				System.out.println(2 * 3);
				System.out.println(2 * 4);
				System.out.println(2 * 5);
				System.out.println(2 * 6);
				System.out.println(2 * 7);
				System.out.println(2 * 8);
				System.out.println(2 * 9);
				
				//3단  변수를 사용했지만 상태변경이 잦은 경우 중복이 많음. 결과 값을 바꾸기 위해서 변수의 값을 재설정해줘야함. 
				
				int samdan = 3;
				int result = samdan * 1 ;
				System.out.println(result);
				result = samdan *2;
				System.out.println(result);
				result = samdan *3;
				System.out.println(result);
				result = samdan *4;
				System.out.println(result);
				result = samdan *5;
				System.out.println(result);
				result = samdan *6;
				System.out.println(result);
				result = samdan *7;
				System.out.println(result);
				result = samdan *8;
				System.out.println(result);
				result = samdan *9;
				System.out.println(result);
				
				//4단 기능을 더하여 사용자에게 숫자를 입력받아 구구단을 출력하는 방식으로 구현 Scanner class 사용
			
				System.out.println("출력할 구구단은? : ");
				Scanner scanner = new Scanner(System.in);
				int number = scanner.nextInt();
				System.out.println("입력받은 단 : "+ number);
				
				int result2 = number * 1 ;
				System.out.println(result2);
				result2 = number * 2;
				System.out.println(result2);
				result2 = number * 3;
				System.out.println(result2);
				result2 = number * 4;
				System.out.println(result2);
				result2 = number * 5;
				System.out.println(result2);
				result2 = number * 6;
				System.out.println(result2);
				result2 = number * 7;
				System.out.println(result2);
				result2 = number * 8;
				System.out.println(result2);
				result2 = number * 9;
				System.out.println(result2);
				
				
				
				

	}

}
