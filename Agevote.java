public class Agevote {

	public static void main(String[] args) {
		int age = 17;
		if(age>=18) {
			if(age<=100) {
				System.out.println("valid voter");
				
			}
			else {
				System.out.println("Invalid voter as age is greater than 100");
			}
		}
		else {
			System.out.println("Invalid voter as age is less than 18");
		}

	}

}
