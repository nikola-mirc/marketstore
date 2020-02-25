package nikola.mirc;

public class SilverDiscountCard extends DiscountCard {

	public SilverDiscountCard(double startTurnover, Customer customer) {
		super(startTurnover, customer);
	}

	@Override
	public double getDiscountRate() {
		if (this.turnover > 300) {
			return 3.5;
		}
		return 2;
	}
}