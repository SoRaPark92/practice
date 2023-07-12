package java01_variables;

public class Variables_05 {

	public static void main(String[] args) {

		//학생의 나이
//		int student age; //에러, 띄어쓰기 금지
		
		int student_age; //snake case, 뱀 표기법
		
		int studentAge;  //camel case, 낙타 등 표기법(Java 권장)
		
		// 자바에서는 낙타등표기법(camel case)를 권장하고 있다
		
		
		//-------------------------------------------------------------
		
//		int  1stNumber; //에러, 숫자로 시작하면 안된다.
		
		int firstNumber;
		
		//-------------------------------------------------------------
		
		
		
//		int int; // 에러, 예약어(키워드)는 사용할 수 없다
		
		int intNum;
		int intData;

		//-------------------------------------------------------------
		
		//**의미없는 변수명을 사용하지 않도록 한다!!!!(자바는 어떤의미인지 이름을 알 수 있게 사용한다)
		
		
		
		int a;
		int b;
		int c;
		
		//-------------------------------------------------------------		
		
		//알아보기 힘든 변수명 사용하지 않기!
		
		// 에러
//		int _;
		
		int $;
		
		int ____;
		int ____$$____;
		
		//-------------------------------------------------------------	
		
		int number;
		
		int number_;
		
		int _number;
		int $number;
		
//		위에 사용방식보다는 아래 사용방식을 권유
		
		int number1;
		int number2;
		int number3;
		
		//-------------------------------------------------------------	
		
		// 한글로 식별자를 설정하면 안된다!
		
		double 넓이 = 543.32;
		System.out.println( 넓이 );
		
		
		
		
	}

}
