package java05_array_array2D;

import java.util.Scanner;

public class Array2D_04 {
	
	//학생 성적 관리 프로그램
	//	-> 국영수 3과목 점수
	
	// 점수1개		-> int
	// 3과목 점수 	-> int[3]
	// 4학생의 점수	-> int[4][3]
	// 2개 학급		-> int[2][4][3]
	// 1~3학년		-> int[3][2][4][3]
	
	public static void main(String[] args) {


//		int[][][][] sco = new int[3][2][4][3];
//		
//		//----------------------------------------
//		
//		int[][][] sco1 = new int[2][4][3];
//		int[][][] sco2 = new int[2][4][3];
//		int[][][] sco3 = new int[2][4][3];
//		
		//----------------------------------------		
	      //QUIZ.
	      //   2명의 국어, 영어, 수학 점수를 처리하기
	      //   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 
	      
	      //   ** 2차원배열 이용해보기
	      
	      //   int[2][3] - 학생들 점수
	      //   int[2] - 학생들 총점
	      //   double[2] - 학생들 평균
	      
	      //----- 최종 출력 -----
	      //   번호   국어   영어   수학   총점   평균
	      //   1번      xxx      xxx      xxx      xxx      xxx.xx
	      //   2번      xxx      xxx      xxx      xxx      xxx.xx
	      
		//학생수 int2
		//과목 int3
		Scanner sc = new Scanner(System.in);
		
		int [][] score = new int[2][3];//2명의 학생들 3과목 점수
		
		int [] sum = new int[2];//2명의 학생들 총점
		
		double[] avg = new double[2];//2명의 학생들 평균
		
		final String[] SUBJECT = {"국어", "영어","수학"};
		
		//2명에 대한 3과목 점수 입력
		for(int i=0; i<score.length; i++) {//i번째 학생
			
			for(int j=0; j<score[i].length; j++) {//j번째 과목
				
				System.out.println((i+1)+ "번째 학생의 "+SUBJECT[j]+"점수는?");
				score[i][j] = sc.nextInt();
			}
			
			System.out.println();
		}
//			for(int i=0; i<score.length; i++) {
//				for(int j=0; j<score[i].length; j++) {
//					System.out.println("TEST"+i+","+j+"]"+score[i][j]);
					
//				}
//			}
			
			//총점 계산하기
			for(int i=0; i<score.length; i++) {
//				sum[i] = score[i][0]+score[i][1]+score[i][2];
				for(int j=0; j<score[i].length; j++) {
					sum[i] += score[i][j];
				}
				
			}
			//평균 계산하기
			for(int i=0; i<score.length; i++) {//i번째 학생
				avg[i] = sum[i]/(double)3;
			}
			
			//평균 계산하기
//			for(int i=0; i<score.length; i++) {
////				System.out.print("TEST]" + avg[i]);			
//				}
			//최종출력
			System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
			for(int i=0; i<score.length; i++) {
				
				//번호
				System.out.print((i+1)+"\t");
				
				//3과목 점수
				for(int j=0; j<score[i].length; j++) {
					System.out.print(score[i][j]+"\t");
					
				}
//				//국어
//				System.out.print(score[i][0]+"\t");
//				
//				//영어
//				System.out.print(score[i][1]+"\t");
//				
//				//수학
//				System.out.print(score[i][2]+"\t");
				
				//총점
				System.out.print( sum[i]+"\t");
				
				//평균
				System.out.printf( "%.2f", avg[i]);
				System.out.println();
				
				
			}
			
		}
}	
		
//		int[][] sco = new int [2][3];
//		sco[0] = new int[2]; //0행 생성
//		sco[1] = new int[3]; 
//		
//		int[] tsc = new int [2];
//		double[]sav = new double[2];
//		String str=  "국어,수학,영어";
//		int sum1 = 0;
//		System.out.println("- - -점수 입력 - - -");
//		for(int i=0; i<sco[1].length; i++) {//행
//			for(int j=0; j<sco[0].length; j++){//열
//			System.out.print(">>" + str.charAt(0,) + "의 점수는?");
//			sco[0]= sc.nextInt(); //국어점수 입력
//			System.out.print(">>" + e + "의 점수는?");
//			sco[0]= sc.nextInt(); //국어점수 입력는?");
//			 System.out.print(">>" + m + "의 점수는?"); 
//			sco[0] = sc.nextInt(); //국어점수 입력
//						  
//			sum1+=i;
//			
//			}	System.out.print( sco[1] + "테스트 ");
//			 
//		}		
		
	
	
	

