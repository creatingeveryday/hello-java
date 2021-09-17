import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("일  월  화  수  목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
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
		// 월에 해당하는 날짜 배열에 입력.
		int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("달을 입력하세요.");
		Scanner sc1 = new Scanner(System.in);
		int inputMonth = sc1.nextInt();
		
		System.out.println(inputMonth+"월은 "+daysOfMonth[inputMonth - 1] +"일까지 있습니다.");
		sc1.close();
	}

}
