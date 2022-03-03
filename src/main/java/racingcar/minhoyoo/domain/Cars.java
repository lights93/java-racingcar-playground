package racingcar.minhoyoo.domain;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Cars {
	private static final String COMMA = ",";
	private final List<Car> cars;

	public Cars(String carNames) {
		this(Arrays.stream(carNames.split(COMMA))
			.map(Car::new)
			.collect(Collectors.toList()));
	}

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public int size() {
		return cars.size();
	}

	public void moveAll(MovingStrategy movingStrategy) {
		cars.forEach(
			car -> car.move(movingStrategy)
		);
	}

	public List<Car> getCars() {
		return cars;
	}

	public Winners findWinners() {
		return new Winners(cars.stream()
			.collect(Collectors.groupingBy(car -> car, TreeMap::new, Collectors.toList()))
			.firstEntry()
			.getValue());
	}
}
