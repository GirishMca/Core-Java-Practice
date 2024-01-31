
public class Child1 extends Parent {
	void showChild() {
		System.out.println("Child class show method");
		
	}
	public static void main(String arg []) {
		Child1 c = new Child1();
		c.showChild();
		c.showParent();
	}

}
