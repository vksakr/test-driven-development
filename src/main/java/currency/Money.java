package currency;

public class Money {

	protected int amount;

	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	public Money plus(Money addend) {
		return new Money(amount + addend.amount, currency);
	}

	String currency() {
		return currency;
	}

	public boolean equals(Object object) {
		Money money = (Money)object;
		return amount == money.amount
			&& currency().equals(money.currency());
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}
