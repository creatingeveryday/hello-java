
// 코드가 많아지고 복잡해지면 관련있는 메소드를 같이 관리해야할 필요성이 생긴다. 그럴때 클래스를 사용해 정리정돈 할 수 있다. 효율적으로 관리 가능하고 가독성이 높아진다. 클래스별로 파일을 나누어 관리할수도 있다.

public class Gugudan {
	public static int[] saveValue(int times , int length) {
		int[] result = new int [length];
		for(int i = 0; i< result.length; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}
	
	
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	
	
	
	
		
				//2단 단순반복 : 시간이 많이 걸림. 재사용성 낮음. 
		
//				System.out.println("2단");
//				
//				System.out.println(2 * 1);
//				System.out.println(2 * 2);
//				System.out.println(2 * 3);
//				System.out.println(2 * 4);
//				System.out.println(2 * 5);
//				System.out.println(2 * 6);
//				System.out.println(2 * 7);
//				System.out.println(2 * 8);
//				System.out.println(2 * 9);
				
				//3단  변수를 사용했지만 상태변경이 잦은 경우 중복이 많음. 결과 값을 바꾸기 위해서 변수의 값을 재설정해줘야함. 
				
//				int samdan = 3;
//				int result = samdan * 1 ;
//				System.out.println(result);
//				result = samdan *2;
//				System.out.println(result);
//				result = samdan *3;
//				System.out.println(result);
//				result = samdan *4;
//				System.out.println(result);
//				result = samdan *5;
//				System.out.println(result);
//				result = samdan *6;
//				System.out.println(result);
//				result = samdan *7;
//				System.out.println(result);
//				result = samdan *8;
//				System.out.println(result);
//				result = samdan *9;
//				System.out.println(result);
				
				//사용자에게 숫자를 입력받아 구구단을 출력하는 방식으로 구현 Scanner class 사용
			
//				System.out.println("출력할 구구단을 입력하세요. ");
//				Scanner scanner = new Scanner(System.in);
//				int number = scanner.nextInt();
//				System.out.println("입력받은 "+ number+"단을 출력합니다.");
//				
//				System.out.println(number * 1);
//				System.out.println(number * 2);
//				System.out.println(number * 3);
//				System.out.println(number * 4);
//				System.out.println(number * 5);
//				System.out.println(number * 6);
//				System.out.println(number * 7);
//				System.out.println(number * 8);
//				System.out.println(number * 9);
				
				
				// 변수와 반복문을 활용해 구현. while / for 사용 
//				System.out.println("while 문을 사용해 구구단을 출력합니다. ");
//				int i = 1;
//				while(i < 10) {
//					System.out.println(number * i );
//					i++;
//					
//				}
//				
//				System.out.println("for문을 사용해 구구단을 출력합니다.");
//				
//				for (int j=1; j< 10; j++) {
//					System.out.println(number * j );
//					
//				}
//				
				//조건문 개념을 활용하여 2~9까지의 숫자만을 입력받아 구구단 구현 
//				System.out.println("출력할 구구단을 입력하세요. ");
//				Scanner scanner = new Scanner(System.in);
//				int number = scanner.nextInt();
//				
//				if(2 <= number && number <= 9) {
//					
//					
//					for (int j=1; j< 10; j++) {
//						System.out.println(number * j );
//						
//					}
//				}else {
//					System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//					
//					
//				}
				
				
				// 배열 기능 추가하여 구구단 구현 
//				System.out.println("출력할 구구단을 입력하세요. ");
//				Scanner scanner = new Scanner(System.in);
//				int number = scanner.nextInt();
//				
//				int result[] = new int[9];
//				
//				for(int i = 0; i < result.length; i++) {
//					result[i] = number * (i + 1);
//					System.out.println(result[i]);
//				
//				}
//				
				
			
	}

