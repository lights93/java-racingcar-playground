package racingcar.minhoyoo.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {
    @DisplayName("자동차 생성 제대로 되는지 확인")
    @Test
    void construct() {
        Cars cars = new Cars(Arrays.asList(new Car("name1"), new Car("name2")));

        assertThat(cars.size()).isEqualTo(2);
    }

    @DisplayName("전체 이동")
    @Test
    void moveAll() {
        // TODO
    }

    @DisplayName("우승자 찾기")
    @Test
    void findWinners() {
        Cars cars = new Cars(Arrays.asList(new Car("pobi", 2),
            new Car("crong", 2),
            new Car("minho", 1)));

        Winners winners = cars.findWinners();

        assertThat(winners)
            .isEqualTo(new Winners(Arrays.asList(new Car("pobi"), new Car("crong"))));
    }
}