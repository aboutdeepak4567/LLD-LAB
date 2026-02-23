package DesignPattern.structural.Strategy.example1;

public class ShootAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Shoot Attack!");

    }
}
