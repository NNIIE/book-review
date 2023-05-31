package one.model;

import one.fly.FlyBehavior;
import one.quack.QuackBehavior;

public abstract class Duck {

    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;

    public Duck(final FlyBehavior flyBehavior,
                final QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();  // 행동클래스에 위임
    }

    public void performQuack() {
        quackBehavior.quack();  // 행동클래스에 위임
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다.");
    }

}
