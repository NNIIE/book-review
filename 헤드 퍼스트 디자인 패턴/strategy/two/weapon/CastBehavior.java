package two.weapon;

public class CastBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("마법주문을 외운다.");
    }

}
