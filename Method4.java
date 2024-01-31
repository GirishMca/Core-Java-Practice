import java.util.Scanner;

public class Method4 {
	int sum(int n1, int n2) {
		
	int res=n1+n2;
	return res;
	}
	
	String sub(int n1, int n2) {
		return "sub="+(n1-n2);
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first no:");
		int no1=input.nextInt();
		System.out.println("Enter second no: ");
		int no2=input.nextInt();
		
		Method4 obj=new Method4();
		String res = obj.sub(no1, no2);
		System.out.println("sub="+res);
		System.out.println(obj.sub(no1, no2));
		System.out.println("add="+obj.sum(no1, no2));
	}
}
	
