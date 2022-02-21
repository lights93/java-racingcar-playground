package racingcar.minhoyoo.common.utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberGeneratorTest {

    @DisplayName("랜덤 숫자 생성")
    @Test
    void generate() {
        assertThat(NumberGenerator.generate()).isBetween(0, 9);
    }
}