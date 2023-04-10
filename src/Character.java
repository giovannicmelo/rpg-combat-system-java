public abstract class Character {

    private String name;
    private int attack;
    private int armor;
    private int pointsOfLife;

    public Character(String name, int attack, int armor, int pointsOfLife) {
        this.name = name;
        this.attack = attack;
        this.armor = armor;
        this.pointsOfLife = pointsOfLife;
    }

    public abstract int hit(String targetName);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getPointsOfLife() {
        return pointsOfLife;
    }

    public void setPointsOfLife(int pointsOfLife) {
        this.pointsOfLife = pointsOfLife;
    }
}
