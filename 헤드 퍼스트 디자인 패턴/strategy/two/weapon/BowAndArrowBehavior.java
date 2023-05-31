package two.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("화살공격을 한다.");
    }

}
