package DesignPattern.structural.Strategy.example1;

public class Player {
    AttackStrategy strategy;

    public void setStrategy(AttackStrategy strategy){
        this.strategy = strategy;
    }

    public void attack(){
        strategy.attack();
    }
}
