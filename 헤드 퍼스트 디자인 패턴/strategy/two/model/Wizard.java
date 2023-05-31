package two.model;

import two.weapon.CastBehavior;

public class Wizard extends Character {

    public Wizard() {
        super(new CastBehavior());
    }

    @Override
    void fight() {
        System.out.println("나는 마법사");
    }

}
