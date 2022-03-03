package racingcar.minhoyoo.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MovingStrategyTest {
	@DisplayName("")
	@Test
	void isMovable() {
		MovingStrategy movingStrategy = () -> true;

		assertThat(movingStrategy.isMovable()).isTrue();
	}
}
