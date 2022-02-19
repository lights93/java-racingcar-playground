package racingcar.minhoyoo.domain;

public class Car {
    private static final int MAX_NAME_SIZE = 5;
    private final String name;

    public Car(String name) {
        if (name == null || name.isEmpty() || name.length() > MAX_NAME_SIZE) {
            throw new IllegalArgumentException("비어있거나 5글자 초과한 이름입니다.");
        }

        this.name = name;
    }
}
