package java05_array;

public class Array_01 {
	public static void main(String[] args) {
		
		
		//배열,array
		
		//변수들의 나열, 묶음
		
		//------------------------
		
		
		int num; //int형 변수 선언
		num = 123;
		
		//------------------
		
		
		//** int[]
		// int배열 타입
		// 참조형 데이터타입
		
		// int형 변수를 여러 개로 나열한 묶음을 배열로 관리하는 자료형
		
		int[] arr;	//int형 배열 타입의 변수 선언
		
		arr = new int[5];
		//	int형 배열 공간 생성
		//	int변수 공간 5개를 만들고 연결해놓는다
		//	전체 공간의 첫 참조값(주소)를 반환한다

		//	-> arr변수에 배열공간의 참조가 저장된다
		
		System.out.println("arr참조값 : "+arr);
		
		//------------------
		
		//배열 생성 시 변수 공간이 묶음으로 한꺼번에 만들어진다
		
		//만들어진 공간들을 인덱스로 관리한다
		//	-> 0번부터 순차적으로 번호를 붙인다
		
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
		
		//에러
		//ArrayIndexOutOfBoundsException:
		//	-> arr배열의 길이가 5니까 인덱스는 0~4만 존재한다
		//	-> 아래 코드는 인덱스 범위를 벗어나 5인덱스를 접근했다
//		arr[5] = 66;
//		arr[-3] = 88;
		//------------------
		
		//반복문을 이용하여 배열의 값 모두 대입하기
		for(int i=0; i<5; i++) {//i,0~4,x5
			arr[i] = (i+1)*100;
		}
		//배열의 모든 값 출력하기
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}

}
