package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		//2-9단 구구단 출력
		
		
//		for(int x=2; x<=9; x++) {//x=2단부터 9단까지,반복9번
//			
//			for(int i=0; i<=9; i++) {  //단*9까지 10번 반복
//				
//				System.out.println(x+" x " + i + " = "+ x*i);
//				
//		}
//			System.out.println("------------------------------");
//		
//			
			
			
			//1. 바깥쪽 for문
			//	2~9단 반복
			
			//dan, 2~9, x8
			
			//2. 안쪽 for문
			//	각 단수에 맞는 구구단 반복
			
			//	i, 1~9, x9
			
			//각 단 진행 반복
			for(int dan=2; dan<=9; dan++) {//dan, 2~9, x8
				for(int i=1; i<=9; i++) { //i,1~9
					System.out.println(dan+" x " + i + " = "+ dan*i);
				}
				
				System.out.println("-----------T------------------");
			}
			
		}
	}


