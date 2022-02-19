package racingcar.minhoyoo.service;

import racingcar.minhoyoo.common.console.Input;
import racingcar.minhoyoo.common.console.Output;
import racingcar.minhoyoo.domain.Cars;
import racingcar.minhoyoo.domain.TrialCount;

public class Game {
    public void init() {
        Output.askInput();
        Cars cars = new Cars(Input.getCarNames());

        Output.askTrialCount();
        TrialCount trialCount = new TrialCount(Input.getTrialCount());
    }
}
