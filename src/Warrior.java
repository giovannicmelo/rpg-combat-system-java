public class Warrior extends Character {

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    private String sword;

    public Warrior(String name, int attack, int armor, int pointsOfLife, String sword) {
        super(name, attack, armor, pointsOfLife);
        this.sword = sword;
    }

    @Override
    public int hit(String targetName) {
        return this.getAttack();
    }
}
