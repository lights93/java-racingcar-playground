package racingcar.minhoyoo.domain;

import java.util.Objects;

public class TrialCount {
    private static final int MIN_COUNT = 0;
    private int count;

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

    public void minus() {
        if (count == MIN_COUNT) {
            throw new IllegalStateException("음수로 변경 불가능합니다.");
        }

        count--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof TrialCount))
            return false;
        TrialCount that = (TrialCount)o;
        return count == that.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

    public boolean isPositive() {
        return count > MIN_COUNT;
    }
}
