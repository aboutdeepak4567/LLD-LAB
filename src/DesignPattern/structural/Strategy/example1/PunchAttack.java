package DesignPattern.structural.Strategy.example1;

public class PunchAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("punching the enemy!");
    }
}
