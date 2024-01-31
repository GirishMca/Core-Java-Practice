
public class Overloading {
	void add(int no1,int no2) {
		System.out.println("Sum="+(no1+no2));
	}
	void add(int no1,int no2,int no3) {
		System.out.println("Sum="+(no1+no2+no3));
	}
	void add(int no1,int no2,int no3,int no4) {
		System.out.println("Sum="+(no1+no2+no3+no4));
	}

	public static void main(String[] args) {
		Overloading ov=new Overloading();
		ov.add(24,88);
		ov.add(24,88,63);
		ov.add(24,88,55,24);
		

	}
		
	}
	
	
	


