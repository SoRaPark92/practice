package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class Br {
	
	public static void main(String[] args) {
	int com;//컴퓨터의 숫자(랜덤)
	int user;//사용자의 숫자(키보드 입력)
	
	Random ran = new Random();//랜덤 객체
	Scanner sc = new Scanner(System.in);//키보드 입력 객체
	
	int num = 1;	//게임 진행 숫자
	int max = 31;	//게임 종료 숫자(정상)
//	int max = 11;	//게임 종료 숫자(테스트)
	
	//승자 체크 변수
	// -> 1: user승
	// -> 2: com승
	int winner = 0;
	
	final int USER_WIN = 1;
	final int COM_WIN = 2;
	
	GAME:
	while(num<=max) {

		//-----  컴퓨터의 숫자 말하기 ------
		
		//컴퓨터의 보정값
		//	-> 랜덤을 무시하고 컴퓨터가 이길 수 있는 연속 숫자까지만 출력함
		
		if( max-num >= 1 && max-num <= 3 ) {
			com = max-num;
		
//			System.out.println("[TEST] com 보정됨 : " + com);
		
		} else {
			com = ran.nextInt(3)+1;	//컴퓨터가 출력할 연속 숫자의 개수, 1~3
			//com = 3;	//테스트
			
//			System.out.println("[TEST] com 랜덤 : " + com);
		}
		
		com = ran.nextInt(3) + 1;	//컴퓨터가 출력할 연속 숫자의 개수, 1~3
//		System.out.println("[TEST] com : " + com);
		
		for(int i=0; i<com; i++) {
			System.out.println("com >> " + num++);	
			
			if(num>max) {
				winner = USER_WIN;//사용자의 승리 체크
				break GAME;
			}
		}
		
		
		//-----  사용자의 숫자 말하기 ------
		
		//1~3 입력할 때까지 반복
		while(true) {
			System.out.println();
			System.out.println(">> 몇 개 연속? ");
			user= sc.nextInt();
			
			if( user >= 1 && user <=3 ) {
				break;
			} else {
				System.out.println("[SYSTEM] 1~3만 입력하세요");
			}
		}
		
		for(int i=0; i<user; i++) {
			System.out.println("user >> " + num++);	
		
			if(num>max) {
				winner = COM_WIN;//컴퓨터의 승리 체크
				break GAME;
			}
		}
	}//while end, 게임 진행 반복문(max까지)
	//승자 출력
	System.out.println();
	if( winner == USER_WIN ) {
		System.out.println(">> 사용자가 승리하였습니다");
		
	} else if( winner == COM_WIN ) {
		System.out.println(">> 컴퓨터가 승리하였습니다");
		
	}
	
}
}
//+ 배스킨라빈스31 게임
//- 컴퓨터와 사용자가 번갈아가면서 연속적으로 숫자를 말한다
//- 컴퓨터와 사용자는 한번의 기회에 연속된 숫자를 1개부터 3개까지
// 말할 수 있다
//- 컴퓨터는 자기 순서에 랜덤한 갯수의 연속된 숫자를 말한다
//- 사용자는 1~3 입력을 통해 연속된 숫자를 말한다
//- 31을 말하는 사람이 진다
//
//
//* 추가 사항
//  31에 가까워지면 컴퓨터는 랜덤이 아닌 자신이 이길수
// 있는 숫자까지만 말한다
//
// ex. 사용자가 29까지 말했다면
//   컴퓨터는 무조건 30까지만 말한다