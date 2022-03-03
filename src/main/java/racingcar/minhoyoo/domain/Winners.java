package racingcar.minhoyoo.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Winners {
	private final List<String> names;

	public Winners(List<Car> cars) {
		this.names = cars.stream()
			.map(Car::getName)
			.collect(Collectors.toList());
	}

	public List<String> getNames() {
		return names;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Winners))
			return false;
		Winners winners = (Winners)o;
		return Objects.equals(names, winners.names);
	}

	@Override
	public int hashCode() {
		return Objects.hash(names);
	}

}
