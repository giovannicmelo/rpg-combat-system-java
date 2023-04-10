public class Game {

    private final Character player1;
    private final Character player2;

    public Game(Character player1, Character player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void execute() {
        Warrior p1 = (Warrior) player1;
        System.out.println("O personagem " + player1.getName() + " ataca o personagem " + player2.getName() + " com " + p1.getSword() + " com um total de " + player1.getAttack() + " de ataque...");

        int damage = player1.getAttack() - player2.getArmor();

        if (damage <= 0) {
            System.out.println("O personagem " + player1.getName() + " não causou nenhum dano");
        } else {
            player2.setPointsOfLife(player2.getPointsOfLife() - damage);
            if (player2.getPointsOfLife() <= 0) {
                System.out.println("O personagem " + player1.getName() + " derrotou o personagem " + player2.getName());
            } else {
                System.out.println("O personagem " + player1.getName() + " causou " + damage + " de dano ao personagem " + player2.getName());
                System.out.println("O personagem " + player2.getName() + " agora está com " + player2.getPointsOfLife() + " pontos de vida.");
            }
        }
    }
}
