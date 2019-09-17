
package rpg.personagens;

public class Personagem {
    
    private String nome;
    private int pontosDeVida;
    private int forca;
    private int magia;
    private int velocidade;
    private int defesa;
    private int nivel;
    int raca;
    
    public Personagem() { }
    
    public Personagem(String nome) {
        this.nome = nome;
    }
    
    public void atacar() {
        System.out.println("Atacou");
    }
    
    void defender() {
        System.out.println("Defender");
    }
    
    void usarMagia() {
        System.out.println("Magia plimplim");
    }   
    
    void usarItem() {
        System.out.println("Usando item");
    }
    
    public void atribuirNome(String nome) {
        this.nome = nome;
    }
    
    public void exibirNome() {
        System.out.println("Nome: " + this.nome);
    }    
    
    protected String retornarNome() {
        return this.nome;
    }
}
