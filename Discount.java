public class Discount {

	public static void main(String[] args) {
		int price=2000;
		int dis=20;
		int amount,payment;
		amount=100-dis;
		payment=(amount*price)/100;
		System.out.println("price  - "+price);
		System.out.println("discount  - "+dis);
		System.out.println("payment after discount  - "+payment );

	}

}