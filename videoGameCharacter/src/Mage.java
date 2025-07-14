// Mage.java
public class Mage extends Character {
    private String spell;

    public Mage(String name, int health, int attackPower, String spell) {
        super(name, health, attackPower);
        this.spell = spell;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts " + spell + " dealing " + attackPower + " damage!");
    }
}