package java04_control.condition;

import java.util.Scanner;

public class IfQuiz {

	public static void main(String[] args) {
		
//	    + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//      >> Input Number : -3
//      >> 음수입니다
//
//    + 입력한 데이터가 3의 배수인지 판별하시오
//     (% 연산자 사용)
//      >> Input Number : 7
//      >> 3의 배수가 아닙니다
//
//    + 두 수를 입력 받아 큰 수를 출력하시오
//      >> Input Number1 : 44
//      >> Input Number2 : 88
//      >> 88 이 더 큰 수
		
		Scanner sc = new Scanner(System.in);
		int num ;
		
		System.out.println("숫자를 입력 : ");
		num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("음수입니다");
		}

		if (num >= 1) {
			System.out.println("양수 입니다");
		}
		
		
		System.out.printf("Input Number1 :");
		int num1 = sc.nextInt();
		System.out.printf("Input Number2 :");
		int num2= sc.nextInt();
		
		if (num1 < num2) {
			System.out.println(num2 + "가 더 큰 수입니다");
		}
		
		if (num1 > num2) {
			System.out.println(num1 + "가 더 큰 수입니다");
		}

		if (num1 == num2) {
			System.out.println("동일합니다");
		}



		
		
		
	}

}
