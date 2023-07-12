package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {

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
		//----------------------------------------------------------숫자는 int ** String은 숫자계산 불가**
		
		String name ;
		int age;
		String gender;
		int korean;
		int english;
		int mathematics;
		
		System.out.println("----입력----");
		
		System.out.print("Input Name : ");
			name = sc.next();
		
		System.out.print("Input Age : ");
			age = sc.nextInt();
		System.out.print("Input Gender : ");
			gender = sc.next();
		System.out.print("Input Korean : ");
			korean = sc.nextInt();
		System.out.print("Input English : ");
			english = sc.nextInt();
		System.out.print("Input Mathematics : ");
			mathematics = sc.nextInt();
		
		int total = korean + english + mathematics;
//		System.out.print(total);
		
		int average = total/3;
//		System.out.print((double)average);
				
		System.out.println("----출력----");
		
		System.out.println("이름	나이	성별	국어	영어	수학	총점	평균");
		System.out.println(name	 +"	"+ age+"	"+gender+"	"+ korean+"	"+ english+"	"+ mathematics+"	"+ total+"	"+ (double)average+"	");
		
		
		
		
	}

}
