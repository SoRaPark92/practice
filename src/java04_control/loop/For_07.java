package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
		   //Quiz.
	//   첫날에 10원을 예금하고,
	//   다음날에는 전날의 2배를
	//   예금하는 방식으로
	//   보름(15일) 동안 저축한 금액은?
//	      -> 327670
		
//		Hint
		//1.필요한 데이터 파악 - 사용목적
		
		// 날짜			int day
		// 예금액		int money
		// 총 금액		int total
		
		//2.반복 패턴 - 몇번 반복
		//반복횟수 : 15번
		//반복구간 : 0~14
		
		//day, 0~14, x15
		
		//3.반복에 맞춰 수행해야하는 작업 - 중괄호 안쪽 코드		
		
		// 예금액 2배로 증가
		// 총 금액에 추가
		
		int day;		//날짜
		int money = 10;	//예금액
		int total = 0;	//총 금액
		
		//반복횟수
	
		
		for(day = 0; day < 15; day++) {//DAY,0~14,X15
			
			total += money;
			
			System.out.println(day + "test)money : " +money);		
			System.out.println(day + "test)total : " +total);

			money *= 2;

			System.out.println();
		}
		System.out.println();
		System.out.println("저축한 총 금액 : " + total + "원");
		
//		int total =0 ;
//		int sum = 10;
//		int d = 10;
//		
//		for (int i = 0; i<=1; i++) {
//			
//			sum = sum +(i*d);
//			
//			
//		}
//		
//		System.out.println("합계: " + sum);
//		
//		
		
		
		
		
	}

}
