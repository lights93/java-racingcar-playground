package racingcar.minhoyoo.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class TrialCountTest {
    @DisplayName("시도 횟수 정상 생성")
    @Test
    void construct() {
        assertThatCode(() -> new TrialCount("1")).doesNotThrowAnyException();
    }

    @DisplayName("잘못된 값으로 생성시 에러")
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = "-1")
    void constructError(String count) {
        assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> new TrialCount(count))
                .withMessage("숫자가 아니거나 음수입니다.");
    }
}