package one.model;

import one.fly.FlyWithWings;
import one.quack.MuteQuack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        super(new FlyWithWings(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("저는 청둥오리에요.");
    }

}
