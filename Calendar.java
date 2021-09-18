import java.util.Scanner;

public class Calendar {

	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

	}

	int[] maxDaysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 메소드를 활용해서 만들어보기
	public int getMaxDaysMonth(int month) {
		return maxDaysOfMonth[month - 1];

	}

	public static void main(String[] args) {

//		//두 수의 합 구하기.( 키보드 입력을 받은 두 수)
//		int a, b; 
//		Scanner sc = new Scanner(System.in);
//		String s1, s2;
//		System.out.println("두 수를 입력해주세요.");
//		s1 = sc.next();
//		s2 = sc.next();
//		System.out.println(s1+ ","+ s2);    // 잘 입력 받았는지 확인. 
//		a = Integer.parseInt(s1);
//		b = Integer.parseInt(s2);
//		
//		// 두 수 의 합 출력 
//		System.out.printf("두 수의 합은 %d입니다.", a+b);
//		sc.close(); 

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력을 구현.
//		System.out.println("달을 입력하세요.");
//		Scanner sc1 = new Scanner(System.in);
//		int inputMonth = sc1.nextInt();
//		sc1.close();


//		System.out.println(inputMonth+"월은 "+daysOfMonth[inputMonth - 1] +"일까지 있습니다.");       //배열 기능으로 출력
//		Calendar cal = new Calendar();
//		System.out.printf("%d월은 %d일까지 있습니다.\n", inputMonth, cal.getMaxDaysMonth(inputMonth)); // 메소드 기능으로 출력 , printf
																								// 메소드 사용.

		
		// 반복 횟수를 입력받고, 월을 입력하면 해당되는 달의 최대 일수를 모아서 한번에 출력하기.
		Calendar cal = new Calendar();
		
		System.out.println("반복횟수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int loopCount = sc.nextInt();
		
		
		System.out.println("월을 입력하세요.");
		
		int[] maxDaysOfMonth = new int [loopCount]; // 반복할 3개의 달에 해당되는 월의 최대 일수를 담을 배열 생성
		int[] pickMonth = new int [loopCount];  // 내가 입력한 달을 담은 배열 생성한 후 값 저장. 
		

		int j = 0;
		while(j < loopCount) {								//반복횟수 만큼 탐색 및 값 배열에 저장하는 행위 반복실행 
			Scanner sc1 = new Scanner(System.in);
			int month1 = sc1.nextInt();
			pickMonth[j] = month1;
			j++;
			if( j == loopCount) {
				sc1.close();
			}
		}
		
		//반복문을 활용해 내가 입력한 각각의 달에 해당되는 월의 최대 일수를 배열에 저장.
		for(int i = 0; i < loopCount;i++) {
			maxDaysOfMonth[i] = cal.getMaxDaysMonth(pickMonth[i]);
		}
		
		//반복문을 활용해 해당 되는 달의 최대일수를 담은 배열 출력.
		for(int i=0; i < loopCount; i++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n", pickMonth[i],maxDaysOfMonth[i] );
		}
		
		cal.printSampleCalendar();
		sc.close();
	}

}
