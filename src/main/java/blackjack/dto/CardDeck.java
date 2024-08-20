package blackjack.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CardDeck {
	private List<Card> cards = new ArrayList<>();
	private static final String[] pattern = {"♠", "♥", "♦", "♣"};
	private static final int cardCount = 13;

	public CardDeck() {
		Arrays.stream(pattern).forEach(this::addCardsByPattern);
	}

	private void addCardsByPattern(String pattern) {
		IntStream.rangeClosed(1, cardCount)
				.mapToObj(this::numberToDenomination)
				.map(denomination -> new Card(denomination, pattern))
				.forEach(card -> cards.add(card));
	}

	private String numberToDenomination(int i) {
		if (i == 1) return "A";
		if (i == 11) return "J";
		if (i == 12) return "Q";
		if (i == 13) return "K";
		return String.valueOf(i);
	}

	public Card pickCard(int index) {
		return cards.get(index);
	}
}
