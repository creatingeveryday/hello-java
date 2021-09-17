
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
				
				int fourdan = 3;
				int result = fourdan * 1 ;
				System.out.println(result);
				result = fourdan *2;
				System.out.println(result);
				result = fourdan *3;
				System.out.println(result);
				result = fourdan *4;
				System.out.println(result);
				result = fourdan *5;
				System.out.println(result);
				result = fourdan *6;
				System.out.println(result);
				result = fourdan *7;
				System.out.println(result);
				result = fourdan *8;
				System.out.println(result);
				result = fourdan *9;
				System.out.println(result);
				
				
				

	}

}
