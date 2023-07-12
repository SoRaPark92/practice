package java07_inherit.practice2.product;

public class Computer extends Product{

	public Computer(String model, int price) {
	//디폴트 생성자 호출
		super(model,price);
	}
	
	@Override
	public void out() {
		System.out.println("Computer");
	}
}
