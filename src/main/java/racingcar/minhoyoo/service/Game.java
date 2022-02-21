package racingcar.minhoyoo.service;

import racingcar.minhoyoo.common.console.Input;
import racingcar.minhoyoo.common.console.MessageMaker;
import racingcar.minhoyoo.common.console.Output;
import racingcar.minhoyoo.domain.Cars;
import racingcar.minhoyoo.domain.TrialCount;

public class Game {
    public void init() {
        Cars cars = getCars();

        TrialCount trialCount = getTrialCount();

        race(cars, trialCount);
    }

    private Cars getCars() {
        Output.askInput();
        return new Cars(Input.getCarNames());
    }

    private TrialCount getTrialCount() {
        Output.askTrialCount();
        return new TrialCount(Input.getTrialCount());
    }

    private void race(Cars cars, TrialCount trialCount) {
        Output.printResult();
        while (trialCount.isPositive()) {
            cars.moveAll();
            trialCount.minus();

            Output.printCarStatus(MessageMaker.makeCarsMessage(cars));
        }
    }
}
