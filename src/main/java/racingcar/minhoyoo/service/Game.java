package racingcar.minhoyoo.service;

import racingcar.minhoyoo.common.console.Input;
import racingcar.minhoyoo.common.console.Output;
import racingcar.minhoyoo.common.utils.MessageMaker;
import racingcar.minhoyoo.domain.Cars;
import racingcar.minhoyoo.domain.TrialCount;
import racingcar.minhoyoo.domain.Winners;

public class Game {
    public void init() {
        Cars cars = getCars();

        TrialCount trialCount = getTrialCount();

        Winners winners = race(cars, trialCount);
        Output.printWinners(MessageMaker.makeWinnersMessage(winners));
    }

    private Cars getCars() {
        Output.askInput();
        return new Cars(Input.getCarNames());
    }

    private TrialCount getTrialCount() {
        Output.askTrialCount();
        return new TrialCount(Input.getTrialCount());
    }

    private Winners race(Cars cars, TrialCount trialCount) {
        Output.printResult();
        while (trialCount.isPositive()) {
            cars.moveAll();
            trialCount.minus();

            Output.printCarStatus(MessageMaker.makeCarsMessage(cars));
        }

        return cars.findWinners();
    }
}
