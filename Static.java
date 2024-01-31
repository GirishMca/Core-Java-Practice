
public class Static {
	static {
		System.out.println("static block");
		
	}
	Static(){
		System.out.println("non argument cons");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		Static s1=new Static();
	}
}


