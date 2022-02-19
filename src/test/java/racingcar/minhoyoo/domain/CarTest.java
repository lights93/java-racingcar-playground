package racingcar.minhoyoo.domain;

import static org.assertj.core.api.Assertions.*;

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
    void constructError(String name) {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> new Car(name))
                .withMessage("비어있거나 5글자 초과한 이름입니다.");
    }
}