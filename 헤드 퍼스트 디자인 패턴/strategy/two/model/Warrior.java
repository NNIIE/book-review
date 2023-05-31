package two.model;

import two.weapon.AxeBehavior;

public class Warrior extends Character {

    public Warrior() {
        super(new AxeBehavior());
    }

    @Override
    void fight() {
        System.out.println("나는 전사");
    }

}
