package racingcar.minhoyoo.common.utils;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingcar.minhoyoo.domain.Car;
import racingcar.minhoyoo.domain.Cars;
import racingcar.minhoyoo.domain.Winners;

class MessageMakerTest {
    @DisplayName("자동차 출력용 메시지 생성")
    @Test
    void makeCarsMessage() {
        Cars cars = new Cars("one,two");

        assertThat(MessageMaker.makeCarsMessage(cars))
            .isEqualTo("one : \ntwo : \n");
    }

    @DisplayName("우승자 출력용 메시지 생성")
    @Test
    void makeWinnersMessage() {
        Winners winners = new Winners(Arrays.asList(new Car("pobi"), new Car("honux")));

        assertThat(MessageMaker.makeWinnersMessage(winners))
            .isEqualTo("pobi, honux");
    }
}