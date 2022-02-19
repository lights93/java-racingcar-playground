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

    @DisplayName("횟수 뺴기")
    @Test
    void minus() {
        TrialCount trialCount = new TrialCount("1");

        trialCount.minus();

        assertThat(trialCount).isEqualTo(new TrialCount("0"));
    }

    @DisplayName("횟수 뺴기")
    @Test
    void minusError() {
        TrialCount trialCount = new TrialCount("0");

        assertThatExceptionOfType(IllegalStateException.class)
            .isThrownBy(trialCount::minus)
                .withMessage("음수로 변경 불가능합니다.");
    }

    @DisplayName("양수인지 확인")
    @Test
    void isPositive() {
        TrialCount zeroCount = new TrialCount("0");
        assertThat(zeroCount.isPositive()).isFalse();

        TrialCount positiveCount = new TrialCount("1");
        assertThat(positiveCount.isPositive()).isTrue();
    }
}