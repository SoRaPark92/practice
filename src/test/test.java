package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		//QUIZ.
	//   2명의 국어, 영어, 수학 점수를 처리하기
	//   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 

	//   ** 2차원배열 이용해보기

	//   int[2][3] - 학생들 점수
		//학생수,점수
	//   int[2] - 학생들 총점		->sum
	//   double[2] - 학생들 평균	->avg
		
		//과목수 총3개	->int 3개	->점수 입력sc사용
		//학생수 총 2개	->int 2개
		
	Scanner sc = new Scanner(System.in);
	
	int[][]stu  = new int[2][3];
	int[] sum	= new int[2];
	int[] avg	= new int[3];
	
	
			
	}//메인

}//클래스

//----------------------------------------		


//----- 최종 출력 -----
//   번호   국어   영어   수학   총점   평균
//   1번      xxx      xxx      xxx      xxx      xxx.xx
//   2번      xxx      xxx      xxx      xxx      xxx.xx

//학생수 int2
//과목 int3