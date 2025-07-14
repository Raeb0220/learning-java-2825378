// Archer.java
public class Archer extends Character {
    private int arrowCount;

    public Archer(String name, int health, int attackPower, int arrowCount) {
        super(name, health, attackPower);
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow (" + arrowCount + " left) with force " + attackPower + "!");
    }
}