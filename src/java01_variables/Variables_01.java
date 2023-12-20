package java01_variables;		//패키지 선언

// 한 줄 주석

/*
 	문장 주석
 	
 	여러 줄을 주석으로 처리한다

 */


//한 줄 주석 토글(toggle) 단축키 : ctrl + shift + c

public class Variables_01 {		//클래스 정의 (클래스와 확장자 이름이 같아야한다)

	public static void main(String[] args) {	//메인 메소드-프로그램 시작점
		
//		System.out.println("동작 테스트");
		
		
		//----------------------------------------------------------
		
		System.out.println( 12345 );	//int
		System.out.println( 123.456 );	//double
		System.out.println( true );	//boolean
		System.out.println( 'A' );	//char, 단일 문자(글자 1개)
		System.out.println( 'D' );	//char, 단일 문자(글자 1개)
		
		System.out.println("Hello"); //String타입, 문자열(기본문자타입X),""안에는 없거나 빈칸도 가능,여러글자도 인식,복잡한 데이터타입
		

		
		//----------------------------------------------------------
		
		
		//char 형 - 정수 관계
		
		System.out.println('가');
		System.out.println((int)'가');		//char형 -> int형 변환하여 출력 : 44032
		
		System.out.println( 99 ); 			//int형
		System.out.println( (char) 99 ); 	//int형 -> char형 변환하여 출력 : 'c'
		System.out.println( (char)0x63 ); 	//int형 -> char형 변환하여 출력 : 'c'
		
		
		//----------------------------------------------------------
		
		
		
	}//메인 메소드의 끝, 자바 프로그램의 중단점(Terminate)

} // Test 클래스 정의 끝  

