package racingcar.minhoyoo.common.utils;

import racingcar.minhoyoo.domain.Car;
import racingcar.minhoyoo.domain.Cars;
import racingcar.minhoyoo.domain.Winners;

public class MessageMaker {
	private static final String DASH = "-";
	private static final String NEW_LINE = "\n";

	private MessageMaker() {
	}

	public static String makeCarsMessage(Cars cars) {
		StringBuilder stringBuilder = new StringBuilder();

		for (Car car : cars.getCars()) {
			stringBuilder.append(makeCarMessage(car));
			stringBuilder.append(NEW_LINE);
		}

		return stringBuilder.toString();
	}

	private static String makeCarMessage(Car car) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(car.getName());
		stringBuilder.append(" : ");

		for (int i = 0; i < car.getPosition(); i++) {
			stringBuilder.append(DASH);
		}

		return stringBuilder.toString();
	}

	public static String makeWinnersMessage(Winners winners) {
		return String.join(", ", winners.getNames());
	}
}
