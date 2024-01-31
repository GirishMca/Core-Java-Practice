
public class Demo1 {
	int eno;
	String name;
	void setValue(int eno,String name) {
		this.eno=eno;
		this.name=name;
	}
	void show() {
		System.out.println("Emp No="+" "+eno);
		System.out.println("name No="+" "+name);
		
	}
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.setValue(101,"Tanya");
		d1.show();
	}
	  Demo1 d2=new Demo1();
	    d2.setValue(102,"Girish");
	    d2.show();
	
	  
}

	
		

	


