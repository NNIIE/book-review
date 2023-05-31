package one.model;

import one.fly.FlyRocketPowered;
import one.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new FlyRocketPowered(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리 입니다.");
    }

}
