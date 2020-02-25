package nikola.mirc;

public class BronzeDiscountCard extends DiscountCard {

	public BronzeDiscountCard(double startTurnover, Customer customer) {
		super(startTurnover, customer);
	}

	@Override
	public double getDiscountRate() {
		if (this.turnover < 100) {
			return 0.0;
		} else if (this.turnover >= 100 && this.turnover <= 300) {
			return 1.0;
		} else {
			return 2.5;
		}
	}
}
