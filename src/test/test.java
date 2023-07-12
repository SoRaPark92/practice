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
		
		int[][] sor= new int[2][3];
		int[] sum = new int[2];
		double[] avg;
		final String[] SUBJECT = {"국어", "영어","수학"};

		//
		
		//과목별 학생 점수
		for(int i=0; i<sor.length; i++) {//학생의 수(행2개)
			for(int j=0; j<sor[i].length; j++) {//과목의 수(열3개)
				
				System.out.print((i+1)+ "번째 학생의 "+SUBJECT[j]+"점수는?");
				sor[i][j] = sc.nextInt();
			
				
				System.out.println();	
			}
		} System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<sor.length; i++) {
			
			//번호
			System.out.print((i+1)+"\t");
			
			//3과목 점수
			for(int j=0; j<sor[i].length; j++) {
				System.out.print(sor[i][j]+"\t");
				
			}System.out.println();
		
		}	
	}//메인

}//클래스

//----------------------------------------		


//----- 최종 출력 -----
//   번호   국어   영어   수학   총점   평균
//   1번      xxx      xxx      xxx      xxx      xxx.xx
//   2번      xxx      xxx      xxx      xxx      xxx.xx

//학생수 int2
//과목 int3