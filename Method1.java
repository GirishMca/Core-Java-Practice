
public class Method1 {
	void sum() {
		int no1=10, no2=2;
		int add=no1+no2;
		System.out.println("addition="+add);
		}
	void sub() {
		int no1=10, no2=2;
		System.out.println("sub="+(no1-no2));
	}

	public static void main(String[] args) {
		Method1 obj=new Method1();
		obj.sum();
		obj.sub();
	}
}

