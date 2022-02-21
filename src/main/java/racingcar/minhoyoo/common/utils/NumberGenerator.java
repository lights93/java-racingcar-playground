package racingcar.minhoyoo.common.utils;

import java.util.Random;

public class NumberGenerator {
    private static final Random RANDOM = new Random();
    public static final int UPPER_BOUND = 10;

    private NumberGenerator() {}

    public static int generate() {
        return RANDOM.nextInt(UPPER_BOUND);
    }
}
