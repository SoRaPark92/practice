package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class Br {
	public static Random ran = new Random();	//랜덤 객체 생성
	public static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {

		boolean turn = ran.nextBoolean();	//0: 컴퓨터 , 1 : 사용자
		int currentCount = 0;
		while(currentCount<31) {
			if (turn) {
				System.out.println("user 의 차례입니다");
				currentCount = userTurn(currentCount);
			} else {
				System.out.println("com 의 차례입니다");
				currentCount = comTurn(currentCount);
			}
			turn = !turn;
		}
		
		

	}
	
	/**
	 * 사용자 차례일때 처리하는 로직
	 * @param currentCount
	 * @return
	 */
	private static int userTurn(int currentCount) {
		System.out.println("1-3숫자를입력해주세요");
		int	input = sc.nextInt();
		for(int i=0; i< input; i++) {
			if(currentCount>=31) {
				System.out.println("user 패배입니다");
				break;
			}
			System.out.println(++currentCount);
		}
		return currentCount;
	}
	
	private static int comTurn(int currentCount) {
		int com = ran.nextInt(3)+1 ;
		for(int i=0; i< com; i++) {
			if (i != 0 && currentCount==30) {
				System.out.println("com은 30이 가까워져서 도망갑니다.");
				break;
			}
			
			if(currentCount>=31) {
				System.out.println("com 패배입니다");
				break;
			}
			System.out.println(++currentCount);
		}
		return currentCount;
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