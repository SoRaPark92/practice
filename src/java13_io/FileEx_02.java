package java13_io;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {

		//절대 경로 지정
		File file1 = new File("C:\\Users\\TheMKT\\Desktop\\workspace\\JavaBasic\\src\\java13_io\\", "Hello");
	
		System.out.println( file1.length() );
		System.out.println( file1.exists() );
	
		System.out.println("------------------------------------");
	
		
		//상대 경로 지정
//		File file2 = new File("src\\java13_io\\", "Hello");
		File file2 = new File("./src\\java13_io\\", "Hello");

		System.out.println(file2);
		
		System.out.println( file2.length() );
		System.out.println( file2.exists() );
	
		System.out.println("------------------------------------");
	
		
		//상대 경로 기준접 == 클래스 패스 == 프로젝트 폴더
		//C:\Users\TheMKT\Desktop\workspace\JavaBasic
		
//		File file3 = new File("./src/java13_io/file/../../java10_collection/","user.properties");
//		File file3 = new file("/경로 적어보기", "Hello");
//		File file3 = new File("/Users\\TheMKT\\Desktop\\workspace\\JavaBasic\\src\\java13_io/","Hello");
//		File file3 = new File("../JavaBasic\\src\\java13_io/", "Hello");
//		File file3 = new File("src\\java13_io/", "Hello");
		File file3 = new File("../../../Desktop\\workspace\\JavaBasic\\src\\java13_io/", "Hello");
		
		System.out.println(file3.exists());
		
	}

}
