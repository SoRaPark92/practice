package java09_api;

public class StringBuilderEx {
	public static void main(String[] args) {
		
		StringBuilder sb;
		
		//에러, String처럼 사용할 수 없다
//		sb = "Apple";
		
		//객체 생성
		sb = new StringBuilder();
		
		System.out.println("length  : " + sb.length());	//길이
		System.out.println("capacity : " + sb.capacity());	//용량
		
		System.out.println("------Apple 추가------");
		
		sb.append("apple");
		
		sb.append(123);
		sb.append(true);
		
		System.out.println( sb );
		
		System.out.println("length : " + sb.length());//길이
		System.out.println("capacity : " + sb.capacity());	//용량
		
		
		System.out.println("----------");
		
		//기본 capacity인 16을 넘는 값 추가
		sb.append("Bananananananannananananana");
		

		System.out.println( sb );
		
		System.out.println("length : " + sb.length());//길이
		System.out.println("capacity : " + sb.capacity());	//용량
			
		
		System.out.println("=====trimToSize======");
		//capacity를 length만큼 맞춰 줄인다
		sb.trimToSize();
		
		System.out.println("length : " + sb.length());//길이
		System.out.println("capacity : " + sb.capacity());	//용량
		
		
		
	}

}
