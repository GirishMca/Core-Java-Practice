
public class Calculator {
	private int no1=10,no2=2;
	public void sum() {
		System.out.println(no1+no2);
		
	}
	public void sub() {
		System.out.println(no1-no2);
		
	}
}
class User1{
	public static void main(String[] args) {
		Calculator cale=new Calculator();
		cale.sum();
		cale.sub();
	}
}

	

	


