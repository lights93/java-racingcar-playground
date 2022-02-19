package racingcar.minhoyoo.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MoveStatusTest {
    @DisplayName("STOP 상태 생성")
    @ParameterizedTest
    @ValueSource(ints = {0, 3})
    void constructStop(int num) {
        assertThat(MoveStatus.from(num)).isEqualTo(MoveStatus.STOP);
    }

    @DisplayName("FORWARD 상태 생성")
    @ParameterizedTest
    @ValueSource(ints = {4, 9})
    void constructForward(int num) {
        assertThat(MoveStatus.from(num)).isEqualTo(MoveStatus.FORWARD);
    }

    @DisplayName("잘못된 숫자 조건 값인 경우 에러")
    @ParameterizedTest
    @ValueSource(ints = {-1, 10})
    void constructError(int num) {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> MoveStatus.from(num))
            .withMessage("잘못된 전진 조건 숫자값입니다.");
    }

    @DisplayName("FORWARD 인지 확인")
    @Test
    void isForward() {
        assertThat(MoveStatus.FORWARD.isForward()).isTrue();
        assertThat(MoveStatus.STOP.isForward()).isFalse();
    }
}