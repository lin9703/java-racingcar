package racingcar;

import racingcar.domain.RacingCars;
import racingcar.domain.StraightMove;
import racingcar.utils.ValidationUtil;

import static racingcar.view.InputView.getCarNameList;
import static racingcar.view.InputView.getMoveCount;
import static racingcar.view.ResultView.printResult;
import static racingcar.view.ResultView.printWinners;

public class RacingCarMain {

    public static void main(String[] args) {
        /* 자동차 이름 리스트와 이동 횟수 받기 */
        String[] carNameList = getCarNameList();
        int moveCount = getMoveCount();

        /* 자동차 이름 검사 */
        ValidationUtil validationUtil = new ValidationUtil();
        validationUtil.validateExcessInputName(carNameList);

        /* RacingCar 인스턴스 생성 */
        RacingCars racingCars = RacingCars.of(carNameList, new StraightMove());

        /* move car 및 출력 */
        for (int i = 0; i < moveCount; i++) {
            racingCars.moveCars();
            printResult(racingCars);
        }

        /* 우승자 출력 */
        printWinners(racingCars.getWinners());

    }
}
