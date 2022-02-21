package racingcar.minhoyoo.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {
    @DisplayName("자동차 제대로 생성하는지 확인")
    @Test
    void construct() {
        assertThatCode(() -> new Car("name")).doesNotThrowAnyException();
    }

    @DisplayName("이름이 비이있거나 5글자 초과시 에러")
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = "123456")
    void constructErrorWhenNameError(String name) {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> new Car(name))
            .withMessage("비어있거나 5글자 초과한 이름입니다.");
    }

    @DisplayName("0 이하의 포지션 입력시 에러")
    @Test
    void constructErrorWhenPositionIsLessThanZero() {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> new Car("name", -1))
            .withMessage("0 이상의 위치만 가능합니다.");
    }

    @DisplayName("상태값에 따라 이동")
    @Test
    void move() {
        Car car = new Car("name");

        car.move(MoveStatus.FORWARD);
        assertThat(car.getPosition()).isEqualTo(1);

        car.move(MoveStatus.STOP);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @DisplayName("비교")
    @Test
    void compareTo() {
        Car car1 = new Car("name1");

        Car car2 = new Car("name2", 1);

        List<Car> carList = Arrays.asList(car1, car2);
        Collections.sort(carList);

        assertAll(
            () -> assertThat(carList.get(0)).isEqualTo(car2),
            () -> assertThat(carList.get(1)).isEqualTo(car1)
        );
    }
}