package blackjack.dto;

/*
 * Copyright 2023 SK ecoplant.
 * All rights reserved.
 * Created by UK Media.
 */
public class Card {
	private final String number;
	private final String shape;

	public Card(String number, String shape) {
		this.number = number;
		this.shape = shape;
	}

	public String getCardInfo() {
		return number + shape;
	}
}
