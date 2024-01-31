import java.util.Scanner;

public class Method2 {
	void sum(int n1, int n2) {
		int res=n1+n2;
		System.out.println("add="+res);
	}
	
	void sub(int n1, int n2 ) {
		int res=n1-n2;
		System.out.println("sub="+res);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first no:");
		int no1=input.nextInt();
		System.out.println("Enter second no:");
		int no2=input.nextInt();
		
		Method2 obj=new Method2();
		obj.sum(no1, no1);
		obj.sub(no1, no1);
		
	}

}
