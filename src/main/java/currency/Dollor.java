package currency;

public class Dollor {
	int amount;

	Dollor(int amount) {
		this.amount = amount;
	}

	Dollor times(int multiplier) {
		return new Dollor(amount * multiplier);
	}
}
