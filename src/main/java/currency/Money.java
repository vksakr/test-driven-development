package currency;

public abstract class Money {

	protected int amount;

	protected String currency;

	public static Money dollar(int amount) {
		return new Dollar(amount, null);
	}

	public static Money franc(int amount) {
		return new Franc(amount);
	}

	abstract Money times(int multiplier);

	String currency() {
		return currency;
	}

	public boolean equals(Object object) {
		Money money = (Money)object;
		return amount == money.amount
			&& getClass().equals(money.getClass());
	}
}
