package java09_api.ranQuiz;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;

public class UpDown_T {
	public static void main(String[] args) {
		int com;//컴퓨터의 숫자(랜덤)
		int user;//사용자의 숫자(키보드 입력)
		
		Random ran = new Random();//랜덤 객체
		Scanner sc = new Scanner(System.in);//키보드 입력 객체
		
		System.out.println("-----------START-------------");
		
		com = ran.nextInt(50) + 1; //컴퓨터의 랜덤 숫자 생성, 1~50
		
//		System.out.println("[TEST] " + com);
		
		//7번의 기회
		for(int count=0; count<7; count++) {
			
			//사용자의 입력
			while(true) {
				System.out.print("1~50 까지 중 1개의 숫자를 입력하세요 : ");
				user= sc.nextInt();
				if( user >=1 && user <=50) {
					break;
				} else {
					System.out.println("[SYSTEM] 1~50 범위의 숫자만 입력하세요!");
				}
			}
			
			//컴퓨터 랜덤 숫자(com)와 사용자 입력(user) 숫자 비교
			if( com > user) {//컴퓨터가 클 경우 -> up 출력
				System.out.println("Up");
				
			} else if( com < user) {//컴퓨터가 작을 경우 -> down 출력
				System.out.println("Down");
			} else {//같을경우 -> 사용자 승리
				System.out.println("user 승리");
				
				//main()메소드 중단 코드 = 프로그램 중단 코드
				return;
			}
		
		}//7번의 기회 for end
		System.out.println("com 승리");
		System.out.println("컴퓨터의 숫자는 " + com +" 입니다");}

	}
	

//+ UP&DOWN 게임
//- 컴퓨터가 1~50의 랜덤을 생성한다 (= com)->random구문
//
//- 사용자의 입력을 받는다 (= user)	->scanner
//
//- user가 com보다 낮은지 높은지 판단하여 UP&DOWN을 출력한다 ->for/if문사용
// (기준은 com)
// (ex. com == 40 && user == 30 -> UP )
// 
//- user가 com과 같으면 user 승리->문구
//
//- 7번안에 맞추지 못하면 com 승리->문구