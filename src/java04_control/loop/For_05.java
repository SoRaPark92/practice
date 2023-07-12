package java04_control.loop;

public class For_05 {

	public static void main(String[] args) {
		
		//1부터 10까지의 총합 구하기
		//	->55
		
//		int i = 1;
//		int j = i++;
//					
//		int result = i+j;
//				
//		for( i=1; i>=10; i++) {
//			
//		}
//		System.out.println(result);		

//		int sum = 0;
//		
		//1~10 순서대로 더하기
		
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		sum = sum + 4;
//		sum = sum +	5;
//		sum = sum + 6;
//		sum = sum + 7;
//		sum = sum + 8;
//		sum = sum + 9;
//		sum = sum + 10;
		
		//반복횟수 : 10
		//반복구간 : 1~10
//		
//		System.out.println("총합 : " + sum);
		
//		for (sum = 1; sum>=10; sum++) {
//			System.out.println(sum);
//		}
//		
		
//		for (int i=0; i<7; i++) {
//			System.out.println(i+i);
//		}
		
		
		int sum = 0;
//		for (int i = 0; i <= 10; i++) {
//		    sum = sum+ i;
//		}
		
		for(int i=0; i<10; i++) {	//i, x10, 0~9
			sum = sum + (i+1);
		}
		

		//------------------------------------
		System.out.println("합계: " + sum);

		
	}

}
