package racingcar.domain;

public class Car {
    private final String name;
    private final MoveStrategy moveStrategy;
    private int step;

    public Car(String name, int step, MoveStrategy moveStrategy) {
        this.name = name;
        this.step = step;
        this.moveStrategy = moveStrategy;
    }

    public String getName() {
        return name;
    }

    public int getStep() {
        return step;
    }

    public void move() {
        if (moveStrategy.move())
            step++;
    }
}
