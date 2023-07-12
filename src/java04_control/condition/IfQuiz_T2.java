package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_T2 {
	

	public static void main(String[] args) {
		
//	    + 입력한 데이터가 3의 배수인지 판별하시오
//	     (% 연산자 사용)
//	      >> Input Number : 7
//	      >> 3의 배수가 아닙니다
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		//숫자 하나 입력 받기
		System.out.println("Input Number : ");
		num = sc.nextInt();
		
		
		if(num%3 == 0) {	//3의 배수
			System.out.println("num[" + num+"]은/는 3의 배수이다");
		}

		if(num%3 != 0) {	//3의 배수가 아님
			System.out.println("num[" + num+"]은/는 3의 배수가 아니다");
		}

	}

}
