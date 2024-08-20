package blackjack.service;

import java.security.SecureRandom;

public class RandomService {
	private static final int MAX_NUM = 52;

	public static int getRandomNum() {
		return new SecureRandom().nextInt(MAX_NUM);
	}
}
