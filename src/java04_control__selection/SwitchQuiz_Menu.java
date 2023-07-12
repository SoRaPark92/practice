package java04_control__selection;

import java.util.Scanner;

public class SwitchQuiz_Menu {

//  - 메뉴 만들기
//
//  ===============================
//     M  e  n  u
//  ===============================
//     1. Hello World 출력
//     2. 이름 출력
//     3. 성별 출력
//     4. 종료
//  ===============================
//
//    >> _
//
//   -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//   -> 동작은 간단한 출력으로 해결
	
	public static void main(String[] args) {
		Scanner sc;	//참조형 변수 선언
		sc = new Scanner(System.in);		// 객체 생성, Scanner클래스 기능 활성화
		
		System.out.println("===================");
		System.out.println(" M  e  n  u : ");
		System.out.println("===================");
		System.out.println("1. Hello World 출력");
		System.out.println("2. 이름 출력");
		System.out.println("3. 성별 출력 ");
		System.out.println(" 4. 종료");
		System.out.println("===================");
		
		
		
		while(true){ 
			System.out.println("input Number(종료==0) : ");
			int num = sc.nextInt();
			
			
		switch(num) {
		
		case 1:
			String a = sc.nextLine();
			System.out.println("1. "+ a);
		
		case 2:
			String n = sc.nextLine();
			System.out.print("이름 : "+n);
		case 3:
			String g = sc.nextLine();
			System.out.print("성별 :"+g);
			;
			
		
			
		}if(num==0);
		System.out.print("종료");

		}
	}
	}
	

