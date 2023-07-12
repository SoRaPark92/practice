package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz {
//	5층인 건물의 인원을 입력 받도록 만든후 전체 인원이 나오도록 하게 하여라.
//	그후 각 층마다 관리비를 측정한다. (관리비는 인원당 12000원 이다.)
//
//	- 필요한 배열
//	 1. 각 층의 사는 인원을 담는 배열 arr[6]
//	   // 1~5층 과 총인원 (마지막 배열공간은 입력받은 인원의 총 합으로 사용) 
//	   
//	 2. 각 층의 관리비 배열 arr2[6]
//	   // 1~5층 과 총 관리비 금액 (마지막 배열공간은 관리비의 총 합계금액으로 사용)
//
//	----------------------- 입력 (입력시 for문을 이용한다.)
//	1층의 사는 인원은 ? 4
//	2층의 사는 인원은 ? 5
//	3층의 사는 인원은 ? 11
//	4층의 사는 인원은 ? 2
//	5층의 사는 인원은 ? 8
//	----------------------- 출력 (출력시 for 문을 이용한다.)
//	1층의 총 관리비 : 48000원
//	2층의 총 관리비 : 60000원
//	3층의 총 관리비 : 132000원
//	4층의 총 관리비 : 24000원
//	5층의 총 관리비 : 96000원
//
//	건물에 사는 총 인원은 30명입니다.
//	관리비의 총 금액은 360000원 입니다.

	//인원arr[6]
	//관리비 인당 12000 arr2[6]
	//총합
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//	int n = 0;
//	int p = 12000;
//	int i ;
//	int sum1=0, sum2=0,sum3=0;
//	
//	
//	int [] arr1 , arr2 ;
//	arr1 = new int[6];
//	arr2 = new int[6];
//	
//	for(i=0;i<arr1.length;i++) {
//		int j=i+1;
//		System.out.print(j+"층의 사는 인원은 ?");
//		n = sc.nextInt();
//        System.out.println(n+"명");

				
		Scanner sc = new Scanner(System.in);
	      
	      int n; // 인원수
	      int p=12000; // 가격
	      int sum1=0, sum2=0, sum3=0;
	      
	      int[] arr1, arr2;
	      
	      arr1 = new int[6]; // 길이 설정
	      arr2 = new int[6];
	      
	      for (int i = 0; i < arr1.length-1; i++) {
	         
	         System.out.print((i+1) + "층의 사는 인원은 ? ");
	         n = sc.nextInt();
	         System.out.println(n+"명");
	         sum1 += n; // 총 인원수
	         arr1[i] = n; // arr1 배열값 설정
	         sum2 = p*n; // 한 층의 총 관리비
	         arr2[i] = sum2; /// arr2 배열값 설정
	         System.out.println((i+1)+ "층의 총 관리비 : " + sum2);
	         sum3 += sum2; // 총 금액
	         System.out.println("---------------------------");
	      
	      }
	         
	      System.out.println("건물의 총 인원은 " + sum1 + " 명 입니다");
	      System.out.println("관리비의 총 금액은 " + sum3 +" 원 입니다");
	      System.out.println("---------------------------");

	      for (int i = 0; i < arr1.length-1; i++) {
	         System.out.println(arr1[i]);
	         
	      }
	         arr1[5] = sum1;
	         System.out.println(arr1[5]);
	         System.out.println("---------------------------");
	         
	      for (int i = 0; i < arr1.length-1; i++) {
	         System.out.println(arr2[i]);
	         
	      }
	      arr2[5] = sum3;
	      System.out.println(arr2[5]);

	}
}


