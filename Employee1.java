
public class Employee1 {
	private int empId;
	private String name;
	
	public void seEmpId(int empId) {
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
class Company{
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEno(101);
		e1.setName("Girish");
		
		System.out.println("Employee No ="+e1.getEno());
		System.out.println("Employee Name ="+e1.getName());
	}
}



