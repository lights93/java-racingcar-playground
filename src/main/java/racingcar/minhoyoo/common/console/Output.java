package racingcar.minhoyoo.common.console;

public class Output {
    private Output() {
    }

    public static void askInput() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void askTrialCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }
}
