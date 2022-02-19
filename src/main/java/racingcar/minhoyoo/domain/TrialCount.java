package racingcar.minhoyoo.domain;

public class TrialCount {
    private static final int MIN_COUNT = 0;
    private final int count;

    public TrialCount(String count) {
        this.count = parseInt(count);
        if (this.count < MIN_COUNT) {
            throw new IllegalArgumentException("숫자가 아니거나 음수입니다.");
        }
    }

    private int parseInt(String count) {
        try {
            return Integer.parseInt(count);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아니거나 음수입니다.");
        }
    }
}
