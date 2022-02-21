package racingcar.minhoyoo.common.console;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racingcar.minhoyoo.domain.Cars;

class MessageMakerTest {
    @Test
    void makeCarsMessage() {
        Cars cars = new Cars("one,two");

        assertThat(MessageMaker.makeCarsMessage(cars))
            .isEqualTo("one : \ntwo : \n");
    }
}