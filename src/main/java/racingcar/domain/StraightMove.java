package racingcar.domain;

import java.util.Random;

public class StraightMove implements MoveStrategy {
    @Override
    public boolean move() {
        return new Random().nextInt(10) >= 4;
    }
}
