package racingcar.minhoyoo.domain;

public class Car implements Comparable<Car> {
	private static final int MAX_NAME_SIZE = 5;
	private static final int MIN_POSITION = 0;
	private final String name;
	private int position;

	public Car(String name) {
		this(name, MIN_POSITION);
	}

	public Car(String name, int position) {
		if (name == null || name.isEmpty() || name.length() > MAX_NAME_SIZE) {
			throw new IllegalArgumentException("비어있거나 5글자 초과한 이름입니다.");
		}

		if (position < MIN_POSITION) {
			throw new IllegalArgumentException("0 이상의 위치만 가능합니다.");
		}
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	public void move(MovingStrategy movingStrategy) {
		if (movingStrategy.isMovable()) {
			position++;
		}
	}

	@Override
	public int compareTo(Car o) {
		return Integer.compare(o.position, this.position);
	}
}
