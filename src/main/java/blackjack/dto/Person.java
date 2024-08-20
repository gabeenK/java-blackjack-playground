package blackjack.dto;

import java.util.ArrayList;
import java.util.List;

/*
 * Copyright 2023 SK ecoplant.
 * All rights reserved.
 * Created by UK Media.
 */
public class Person {
	private final String name;
	private final long bettingMoney;
	private List<Card> cards;

	public Person(String name, long bettingMoney) {
		this.name = name;
		this.bettingMoney = bettingMoney;
		this.cards = new ArrayList<>();
	}

	public void picked(Card card) {
		cards.add(card);
	}

	public void showCards() {
		System.out.print(name + " 카드 : ");
		for (Card card : cards) {
			System.out.print(card.getCardInfo() + " ");
		}
		System.out.println();
	}
}
