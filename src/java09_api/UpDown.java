package java09_api;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		
		//- 컴퓨터가 1~50의 랜덤을 생성한다 (= com)->random구문
		
		Random ran = new Random();	//랜덤 객체 생성
		Scanner sc;
		sc = new Scanner(System.in);
		boolean isExist = false;
		
		int	com = ran.nextInt(50) + 1;
		int i=0;
		for(i=0; i<7; i++) {
			System.out.print("1~50 까지 중 1개의 숫자를 입력하세요 : ");
			int user= sc.nextInt();
			System.out.println(com);
			System.out.println("-------");
			if( com > user) {
				System.out.println("Up");
			}
			if( com < user) {
				System.out.println("Down");
			}
			if(com == user) {
				System.out.println("user 승리");
				break;
			}
		}
		if(i==7) {
			System.out.println("com 승리");
		System.out.println("컴퓨터의 숫자는" + com +"입니다");}

	}
	
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