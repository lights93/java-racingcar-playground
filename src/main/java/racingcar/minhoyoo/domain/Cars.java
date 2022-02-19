package racingcar.minhoyoo.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import racingcar.minhoyoo.common.random.NumberGenerator;

public class Cars {
    private static final String COMMA = ",";
    private final List<Car> cars;

    public Cars(String carNames) {
        String[] split = carNames.split(COMMA);

        this.cars = Arrays.stream(split)
            .map(Car::new)
            .collect(Collectors.toList());
    }

    public int size() {
        return cars.size();
    }

    public void moveAll() {
        cars.forEach(
            car -> car.move(MoveStatus.from(NumberGenerator.generate()))
        );
    }
}
