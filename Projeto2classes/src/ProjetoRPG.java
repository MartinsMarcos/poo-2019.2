public class ProjetoRPG {

    public static void main(String[] args) {
        
        Jogador player1 = new Jogador("Koruvus");
       // nome do personagem
        player1.exibirNome();        
        
        Monstro goblin = new Monstro(4);
        goblin.atribuirNome("Goblin");
        goblin.exibirNome();
    }
}