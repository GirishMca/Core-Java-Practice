
public class Demo2 {
	private int empId;
	private String name;
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
}
class Demo3{
	public static void main(String a[]) {
		Demo2 de=new Demo2();
		de.setEmpId(101);
		de.setName("Girish");
		System.out.println(de.getEmpId());
		System.out.println(de.getName());
		
	}
	
	

	
		

	}


