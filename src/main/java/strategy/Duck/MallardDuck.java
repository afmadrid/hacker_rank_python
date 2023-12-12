package strategy.Duck;

import strategy.FlyBehavior.FlyWithWings;
import strategy.QuackBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
