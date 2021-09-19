
public class Calendar {

	private static final int[] maxDaysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] leap_maxDaysOfMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDaysMonth(int year, int month) {
		if (isLeapYear(year)) {
			return leap_maxDaysOfMonth[month - 1];
		} else {
			return maxDaysOfMonth[month - 1];
		}
	}

	public int getMovingCount(int year, int month) {
		/**규칙 1 : 1년이 지난 후 같은 월의 1일은 평년이 지났을 경우 1일 뒤, 윤년이 지났을 경우 2일뒤가 된다.
		 * 1583년 1월 1일은 토요일이다. 
		 * 1584년 1월 1일은? 하루가 지난 일요일이 된다. 
		 * 1585년 1월 1일은? 윤년이지나서 이틀이 지난 화요일이 된다. 
		 * 윤년을 고려한 1년 단위 이동을 반복문을 통해 알 수 있다. 
		 */
		int standard_Year = 1583;   // 1583/JAN/First : Gregorian calendar's Standard.
		int movingByYear = 0;
		for(int i = standard_Year; i < year;i++) {
			if(isLeapYear(i)) {
				movingByYear += 2;
			}else {
				movingByYear += 1;
			}
		}
		
		/** 규칙 2. 특정 월의 1일의 요일에서 그 다음 월의 1일의 요일은 해당 월의 총 일수를 7로 나눈 나머지만큼 오른쪽으로 이동한다.
		 * 1583년 1월 1일 토요일
		 * 1583년 2월 1일 화요일
		 * 월 단위 이동도 역시 반복문을 통해 알 수 있다. 
		 */
		int movingByMonth = 0;
		for(int i = 1; i < month; i++) {
			movingByMonth += getMaxDaysMonth(year, i) % 7;
		}
		
		
		return ( movingByYear + movingByMonth );
							
	}
	
	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d년 %3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("------------------------");
		int maxDay = getMaxDaysMonth(year, month);
		
		// 윤년을 고려한 연이동과 월이동 자동 계산
		int weekday = 0;
		weekday = (getMovingCount(year, month) + 6) % 7;  //1583년 1월 1일은 토요일에 해당하는 6 + 연이동과 월이동 반영 
		
		//공백을 출력함. 
		for (int i = 0; i < weekday; i++) {
			System.out.printf("%s", "   ");
		}
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 7- weekday && weekday != 0) {
				System.out.println();
			}else if(i % 7 == weekday && weekday ==0) {
				System.out.println();
			}
		}
		System.out.println();
		

	}
}

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
//		Calendar cal = new Calendar();
//		
//		System.out.println("반복횟수를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int loopCount = sc.nextInt();

//		System.out.println("월을 입력하세요.");

//		int[] maxDaysOfMonth = new int [loopCount]; // 반복할 3개의 달에 해당되는 월의 최대 일수를 담을 배열 생성
//		int[] pickMonth = new int [loopCount];  // 내가 입력한 달을 담은 배열 생성한 후 값 저장. 

//		int j = 0;
//		while(j < loopCount) {								//반복횟수 만큼 탐색 및 값 배열에 저장하는 행위 반복실행 
//			Scanner sc1 = new Scanner(System.in);
//			int month1 = sc1.nextInt();
//			pickMonth[j] = month1;
//			j++;
//			if( j == loopCount) {
//				sc1.close();
//			}
//		}

//		//반복문을 활용해 내가 입력한 각각의 달에 해당되는 월의 최대 일수를 배열에 저장.
//		for(int i = 0; i < loopCount;i++) {
//			maxDaysOfMonth[i] = cal.getMaxDaysMonth(pickMonth[i]);
//		}
//		
//		//반복문을 활용해 해당 되는 달의 최대일수를 담은 배열 출력.
//		for(int i=0; i < loopCount; i++) {
//			System.out.printf("%d월은 %d일까지 있습니다.\n", pickMonth[i],maxDaysOfMonth[i] );
//		}
