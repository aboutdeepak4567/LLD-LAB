package DesignPattern.Strategy.example1;

public class Test {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setStrategy(new ShootAttack());
        p1.attack();
    }
}
