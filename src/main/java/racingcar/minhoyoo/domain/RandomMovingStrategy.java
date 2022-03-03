package racingcar.minhoyoo.domain;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy {
	private static final int UPPER_BOUND = 10;
	private static final int MIN_MOVE_NUMBER = 4;
	private static final Random RANDOM = new Random();

	@Override
	public boolean isMovable() {
		int num = RANDOM.nextInt(UPPER_BOUND);

		return num >= MIN_MOVE_NUMBER;
	}
}
