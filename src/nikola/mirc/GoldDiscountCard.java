package nikola.mirc;

public class GoldDiscountCard extends DiscountCard {

	public GoldDiscountCard(double startTurnover, Customer customer) {
		super(startTurnover, customer);
	}

	@Override
	public double getDiscountRate() {
		return Math.min(10, 2 + (int) (turnover / 100));
	}
}