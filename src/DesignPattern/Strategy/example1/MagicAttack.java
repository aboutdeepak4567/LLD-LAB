package DesignPattern.Strategy.example1;

public class MagicAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Magic Attack!");

    }
}
