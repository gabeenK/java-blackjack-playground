package blackjack.client;

import blackjack.dto.Person;
import blackjack.service.GameService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

	private final GameService gameService = new GameService();
	Scanner scanner = new Scanner(System.in);

	public void client() {
		System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
		String names = scanner.next();

		gameService.start(getDealer(), getPlayers(names));
	}

	private Person getDealer() {
		return new Person("딜러", 0);
	}

	private List<Person> getPlayers(String names) {
		String[] split = names.split(",");

		List<Person> players = new ArrayList<>();
		for (String name : split) {
			System.out.println(name + "의 배팅 금액은?");
			players.add(new Person(name, scanner.nextLong()));
		}

		return players;
	}
}
