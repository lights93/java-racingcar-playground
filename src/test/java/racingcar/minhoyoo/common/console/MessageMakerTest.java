package racingcar.minhoyoo.common.console;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import racingcar.minhoyoo.domain.Car;
import racingcar.minhoyoo.domain.Cars;
import racingcar.minhoyoo.domain.Winners;

class MessageMakerTest {
    @Test
    void makeCarsMessage() {
        Cars cars = new Cars("one,two");

        assertThat(MessageMaker.makeCarsMessage(cars))
            .isEqualTo("one : \ntwo : \n");
    }

    @Test
    void makeWinnersMessage() {
        Winners winners = new Winners(Arrays.asList(new Car("pobi"), new Car("honux")));

        assertThat(MessageMaker.makeWinnersMessage(winners))
            .isEqualTo("pobi, honux");
    }
}