

package rpg.personagens;

public class Jogador extends Personagem {
    
    int pontosDeMagia;
    int experienciaAtual;
    int experienciaProximoNivel;
    
    public Jogador(String nome) {
        super(nome);
        System.out.println("Construiu um jogador já com o nome");
    }
    
    public Jogador() {
        System.out.println("Construiu um jogador");
    }
    
    @Override
    public void exibirNome() {
        System.out.println("Personagem " + this.retornarNome());
    }
}
