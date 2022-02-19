package racingcar.minhoyoo.domain;

public enum MoveStatus {
    FORWARD,
    STOP;

    private static final int MIN_STOP_NUMBER = 0;
    private static final int MIN_MOVE_NUMBER = 4;
    private static final int MAX_MOVE_NUMBER = 9;

    public static MoveStatus from(int num) {
        if(num >= MIN_MOVE_NUMBER && num <= MAX_MOVE_NUMBER) {
            return FORWARD;
        }

        if(num >= MIN_STOP_NUMBER && num < MIN_MOVE_NUMBER) {
            return STOP;
        }

        throw new IllegalArgumentException("잘못된 전진 조건 숫자값입니다.");
    }

    public boolean isForward() {
        return this == FORWARD;
    }
}
