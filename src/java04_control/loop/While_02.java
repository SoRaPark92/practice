package java04_control.loop;

public class While_02 {
	public static void main(String[] args) {
		
//		초기식;
//		
//		while(조건식) {
//			
//			//조건식이 참(true)일 때 실행할 코드
//			
//			
//			증감식;//while구문의 {}중괄호 안쪽 제일 마지막 코드로 작성하면 for문과 같다
//		}
		//---------------------------------------------------------
		
		for(int i=0; i<10; i++) {//i,0~9,x10
			System.out.println(i);
		}
		System.out.println("---------");
		
		int i=0;	//초기식
		
		while (i<10) {	//조건식
			System.out.println(i);
			
			i++;	//증감식
		}
		
		//---------------------------------------------------------
		//for문은 반복횟수가 정해져있거나 정수값의 진행을 반복으로 적용할 때 사용한다
		
		//while문은 반복횟수가 명확하지 않거나, 정해지지 않았을 때  사용한다
		//	-> 반복 종료 조건만 주어진 경우 많이 사용한다
		
		
	}

}
