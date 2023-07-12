	package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_T {

	public static void main(String[] args) {
		
		//학생 정보 관리 프로그램
		   
		   //   이름, 나이, 성별, 국어, 영어, 수학
		   
		   //   6가지 정보를 저장할 수 있는 변수를 만들고
		   
		   //   총점과 평균을 포함한 결과를 출력한다
		   
		//동작 예시)
		   
		//===== 입력 =====
		//Input Name : Alice
		//Input Age : 33
		   
		//Input Gender : F
		   
		//Input Korean : 100
		//Input English : 99
		//Input Mathematics : 97

		//===== 출력 =====
		//이름   나이   성별   국어   영어   수학   총점   평균
		//Alice   33      F      100      99      97      296      98.666666667
		
		Scanner sc = new Scanner(System.in);	//입력 객체
		//----------------------------------------------------------
		
		System.out.println("----입력----");
		
		//이름 입력
		String name ;
		System.out.print("Input Name : ");
		name = sc.nextLine();
		
		System.out.println("[test] Name : " + name);
		
		//나이 입력
		System.out.print("Input Age : ");
		int	age = sc.nextInt();
		
		System.out.println("[test] Age : " + age);
		
		//성별 입력
		System.out.print("Input Gender : ");
		//String처리 
//		sc.nextLine()									//버퍼 비우기
//		String gender = sc.nextLine();
//		System.out.print("[test] Gender : " + gender);
		
		//char 처리
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		System.out.println("[test] Gender : " + gender);
		
		
		//국어 입력
		System.out.print("Input Korean : ");
		int korean = sc.nextInt();
		
		//영어 입력
		System.out.print("Input English : ");
		int english = sc.nextInt();

		//수학 입력
		System.out.print("Input Mathematics : ");
		int mathematics = sc.nextInt();
		
		System.out.println("[test] 점수 : " +korean +", " + english +","+ mathematics);
		
		
		//총점 계산
		int sum = korean + english + mathematics;
//		System.out.print(total);
		
		
		//평균 계산
		double average = sum / (double)3;			//(double)3 대신 3.0써도 무방
		System.out.println("[test] sum : " + sum);
		System.out.println("[test] average : " + average);

				
		
		//전체 출력
		System.out.println("----출력----");
		
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t");
		System.out.print(korean + "\t");
		System.out.print(english + "\t");
		System.out.print(mathematics + "\t");
		System.out.print(sum + "\t");
//		System.out.print(average);
		
		System.out.println(average);
	    System.out.println(String.format("%.2f",average));
		
	    System.out.printf("%.2f",average);
		System.out.println();

	}

}
