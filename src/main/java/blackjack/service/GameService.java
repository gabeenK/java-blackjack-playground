package blackjack.service;


import blackjack.dto.CardDeck;
import blackjack.dto.Person;

import java.util.List;
import java.util.stream.IntStream;

public class GameService {

	public void start(Person dealer, List<Person> players) {
		CardDeck cardDeck = new CardDeck();
		dealCards(cardDeck, dealer, players);
		printCurrentCard(dealer, players);
	}

	private void dealCards(CardDeck cardDeck, Person dealer, List<Person> players) {
		IntStream.rangeClosed(1, 2).forEach(i -> {
			dealer.picked(cardDeck.pickCard(RandomService.getRandomNum()));
			players.forEach(player -> player.picked(cardDeck.pickCard(RandomService.getRandomNum())));
		});
	}

	private void printCurrentCard(Person dealer, List<Person> players) {
		dealer.showCards();
		players.forEach(Person::showCards);
	}
}