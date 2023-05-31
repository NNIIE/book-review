import one.model.Duck;
import one.model.MallarDuck;
import one.model.ModelDuck;
import two.model.*;
import two.model.Character;

public class Main {

    public static void main(String[] args) {
        one();

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        two();
    }

    private static void one() {
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
    }

    private static void two() {
        Character knight = new Knight();
        knight.attack();

        Character warrior = new Warrior();
        warrior.attack();

        Character wizard = new Wizard();
        wizard.attack();

        Character archer = new Archer();
        archer.attack();
    }

}
