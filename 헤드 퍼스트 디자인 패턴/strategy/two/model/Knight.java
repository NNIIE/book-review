package two.model;

import two.weapon.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        super(new SwordBehavior());
    }

    @Override
    void fight() {
        System.out.println("나는 기사");
    }

}
