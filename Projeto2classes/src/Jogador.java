
public class Jogador extends Personagem {
    
    int pontosDeMagia;
    int experienciaAtual;
    int experienciaProximoNivel;
    
    public Jogador(String nome) {
        super(nome);
        System.out.println("Jogador: Marcos");
    }
    
    public Jogador() {
        System.out.println("Construiu um jogador");
    }
    
    
    public void exibirNome() {
        System.out.println("Personagem " + this.retornarNome());
    }
}