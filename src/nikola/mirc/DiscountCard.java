package nikola.mirc;

public abstract class DiscountCard {

	private Customer customer;
	protected double turnover;

	public DiscountCard(double startTurnover, Customer customer) {
		this.customer = customer;
		this.turnover = startTurnover;
	}

	abstract public double getDiscountRate();

	final public double getDiscount(double amount) {
		return amount * getDiscountRate() / 100;
	}

	final public double getTurnover() {
		return turnover;
	}

	final public void increaseTurnover(double amount) {
		this.turnover += amount;
	}
}
