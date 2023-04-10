public class Magician extends Character {

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    private String spell;

    public Magician(String name, int attack, int armor, int pointsOfLife, String spell) {
        super(name, attack, armor, pointsOfLife);
        this.spell = spell;
    }

    @Override
    public int hit(String targetName) {
        return this.getAttack();
    }
}
