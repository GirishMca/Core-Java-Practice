
public class Student {
	public static final String rollNo = null;
	public static final String cName = null;
	String name;
	public int rollNO;

	public static void main(String[] args) {
		Student S1 = new Student();
		Student S2 = new Student();
		
		System.out.println(S1.name);
		System.out.println(S2.name);
		
		S1.name="Girish";
		System.out.println(S1.name);
		System.out.println(S2.name);
	}
}

