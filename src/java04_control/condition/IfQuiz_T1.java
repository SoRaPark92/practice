package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_T1 {

	public static void main(String[] args) {
		
//	    + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//      >> Input Number : -3
//      >> 음수입니다
//


		Scanner sc = new Scanner(System.in);
		
		
		//숫자 하나 입력 받기
		System.out.println("Input Number : ");
		int num = sc.nextInt();
		
		if (num > 0) {//양수
			System.out.println(num + "이/가 양수입니다");
		}

		if (num < 0) {//음수
			System.out.println("이/가 음수입니다");
		}
		if (num == 0) {//0
			System.out.println("입력한 값은 0 입니다");
		}
				

	}

}
