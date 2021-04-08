package currency;

public class Bank {
	Money reduce(Expression source, String to) {
		Sum sum = (Sum) source;
		int amount = sum.addend.amount + sum.augend.amount;
		return new Money(amount, to);
	}
}
