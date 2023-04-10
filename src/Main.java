public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Guerreiro", 5, 1, 10, "Espada Longa");
        Magician magician = new Magician("Mago", 6, 0, 10, "Bola de Fogo");

        Game game = new Game(warrior, magician);
        game.execute();
        game.execute();
    }
}