
public class Method {

	
		 static void add(int no1,int no2) {
			 System.out.println(no1+no2);
			
		}
		 static void add(int no1,int no2,int no3) {
			 System.out.println(no1+no2+no3);
		 }
		 static void add(int no1,int no2,int no3, int no4) {
			 System.out.println(no1+no2+no3+no4);
			 
		 }
		 public static void main(String[] args) {
			 Demo d=new Demo();
			 Method.add(10,2);
			 Method.add(10,2,1);
			 Method.add(10,2,1,3);
		 }

		}
		
			


