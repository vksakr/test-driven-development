package currency;

import java.util.Hashtable;

public class Bank {
	private class Pair {
		private String from;
		private String to;

		Pair(String from, String to) {
			this.from = from;
			this.to = to;
		}

		public boolean equals(Object object) {
			Pair pair = (Pair)object;
			return from.equals(pair.from) && to.equals(pair.to);
		}

		public int hashCode() {
			return 0;
		}
	}

	private Hashtable<Pair, Integer> rates = new Hashtable<>();

	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	int rate(String from, String to) {
		return rates.get(new Pair(from, to));
	}

	void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), rate);
	}
}
