package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_T3 {

	public static void main(String[] args) {
		//
//	    + 두 수를 입력 받아 큰 수를 출력하시오
//	      >> Input Number1 : 44
//	      >> Input Number2 : 88
//	      >> 88 이 더 큰 수
			
		Scanner sc = new Scanner(System.in);	//입력 객체
		int num1;//입력값변수
		int num2;//입력값변수
		
		//숫자 두 개 입력 받기
		System.out.println("Input Number : ");
		num1 = sc.nextInt();
		System.out.println("Input Number : ");
		num2 = sc.nextInt();
		
		
		if(num1>num2) {//num1이 큰 경우
			System.out.println(num1 + "이/가 큽니다");
		}
		
		if(num1<num2) {//num2가 큰 경우
			System.out.println(num2 + "이/가 큽니다");
		}
		
		if(num1==num2) {//동일할때
			System.out.println("두 숫자가" + num1+ "(으)로 같다");
		}
		
		
		
	}

}
