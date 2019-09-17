package rpg;

import rpg.personagens.Jogador;
import rpg.personagens.Monstro;

public class Rpg {

    public static void main(String[] args) {
        
        Jogador player1 = new Jogador("Kilhjsd");
        //player1.atribuirNome("Zurubabel");
        player1.exibirNome();        
        
        Monstro goblin = new Monstro(4);
        goblin.atribuirNome("Goblin");
        goblin.exibirNome();
    }
    
}
