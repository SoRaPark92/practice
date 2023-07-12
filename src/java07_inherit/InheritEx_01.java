package java07_inherit;



public class InheritEx_01 {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		p.name = "Alice";
		p.age = 123;
		
		p.display();
		
		System.out.println("---");
		
		Child c = new Child();
		
		c.name = "Bob";	//상속받은 필드 
		c.age = 567;	//상속받은 필드
		
		c.score = 1000;	//상속받지 않은 필드
		
		c.display();	//상속받은 메소드
		c.print();		//상속받지 않은 메소드
		}

}
