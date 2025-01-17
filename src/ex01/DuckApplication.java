package ex01;

public class DuckApplication {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}
