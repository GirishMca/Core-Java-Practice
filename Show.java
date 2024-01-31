
public class Show {

	
		void show(int no) {
			System.out.println("show int ="+no);
			
		}
		void show(String no) {
			System.out.println("Show String ="+ no);
			
		}
		void show(char no) {
			System.out.println("Show char ="+ no);
		}
		 public static void main(String[] args) {
			 Demo d=new Demo();
			 Method.show("hello");
			 Method.show(20);
			 Method.show('A');
		 }

	}


