package racingcar.minhoyoo.common.console;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    private Input() {
    }

    public static String getCarNames() {
        return scanner.nextLine();
    }
    public static String getTrialCount() {
        return scanner.nextLine();
    }
}
