package two.model;

import two.weapon.BowAndArrowBehavior;

public class Archer extends Character {

    public Archer() {
        super(new BowAndArrowBehavior());
    }

    @Override
    void fight() {
        System.out.println("나는 궁수");
    }

}
