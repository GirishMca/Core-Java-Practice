import java.util.Scanner;

public class Method3 {
	void sum(int no[]) {
		int sum=0;
		for(int i=0; i<no.length; i++) {
			sum=sum+no[i];
		}
		System.out.println("sum="+sum);
	}
	int pro(int no[]) {
		int pro=1;
		for(int i=0; i<no.length; i++) {
			pro=pro*no[i];
		}
		return pro;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 values in array:");
		for(int i=0; i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		
		Method3 obj=new Method3();
		obj.sum(arr);
		System.out.println("product of all no="+obj.pro(arr));
	}
}
	
		

