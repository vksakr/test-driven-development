package currency;

public class Dollar extends Money{

	Dollar(int amount, String currency) {
		this.amount = amount;
		this.currency = "USD";
	}

	Money times(int multiplier) {
		return new Dollar(amount * multiplier, null);
	}

}
