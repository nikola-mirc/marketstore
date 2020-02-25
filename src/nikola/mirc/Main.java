package nikola.mirc;

public class Main {

	public static void main(String[] args) {

		DiscountCard bdc = new BronzeDiscountCard(0, new Customer("Owner1"));
		DiscountCard sdc = new SilverDiscountCard(600, new Customer("Owner2"));
		DiscountCard gdc = new GoldDiscountCard(1500, new Customer("Owner3"));

		PayDesk.processPayment(bdc, 150);
		PayDesk.processPayment(sdc, 850);
		PayDesk.processPayment(gdc, 1500);
	}

}
