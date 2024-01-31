
public class Employee {
	int eno;
	String name;
	
	void setValue(int eno,String name) {
		this.eno=eno;
		this.name=name;
	}
	void show() {
		System.out.println("Employee Number="+eno+" "+"Employee name ="+name);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setValue(101,"Girish");
		e1.show();
		
		Employee e2=new Employee();
		e2.setValue(102,"Tanya");
		e2.show();
	}
	
		
	}
	
	}



