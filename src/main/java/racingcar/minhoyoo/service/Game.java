package racingcar.minhoyoo.service;

import racingcar.minhoyoo.common.console.Input;
import racingcar.minhoyoo.common.console.Output;

public class Game {
    public void init() {
        Output.askInput();
        String carNames = Input.getCarNames();
    }
}
