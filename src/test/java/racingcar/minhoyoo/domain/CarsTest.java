package racingcar.minhoyoo.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {
    @DisplayName("자동차 생성 제대로 되는지 확인")
    @Test
    void construct() {
        Cars cars = new Cars("pobi,crong,honux");

        assertThat(cars.size()).isEqualTo(3);
    }
}