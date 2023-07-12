package java04_control.loop;

public class while_03 {
	public static void main(String[] args) {
		
//		int dan=1;
//		while( dan<9 ) {
//			dan++;
//		int i=0;
//		while( i<9) {
//				i++;
//				System.out.println(dan+" x " + i + " = "+ dan*i);
//			}
//			
//			System.out.println("-----------------------------");
//		}
		//각 단 진행 반복
		int dan = 2;
		
		while( dan<=9) {//dan, 2~9, x8
			//구구단 출력 
			int i =1;
			while( i<=9) { //i,1~9
				System.out.println(dan+" x " + i + " = "+( dan*i));
			
				i++;
			}
			
			System.out.println("-----------------------------");
			 dan++;
		}
		
	}

}
