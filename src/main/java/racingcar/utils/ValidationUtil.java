package racingcar.utils;

import java.util.Arrays;

public class ValidationUtil {
    public void validateExcessInputName(String[] carNameList) {
        if (Arrays.stream(carNameList)
                .anyMatch(name -> name.length() > 5)) {
            throw new IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.");
        }
    }

    public void validateNullInputName(String[] carNameList) {
        if (Arrays.stream(carNameList)
                .anyMatch(name -> name.length() < 1 || name == null)) {
            throw new NullPointerException("자동차 이름은 0글자일 수 없습니다.");
        }
    }


}
