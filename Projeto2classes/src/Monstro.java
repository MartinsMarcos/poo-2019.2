
public class Monstro extends Personagem {
    
    int experiencia;
    public Monstro() {
        // Zumbis, Humanos, Elfos e Goblins
    }
    
    public Monstro(int raca) {
        // Zumbis, Humanos, Elfos e Goblins
        switch (raca) {
            case 1:
                System.out.println("Ra�a: Zumbi");
                break;
            case 2:
                System.out.println("Ra�a: Humano");
                break;
            case 3:
                System.out.println("Ra�a: Elfo");
                break;
            case 4:
                System.out.println("Ra�a: Goblin");
                break;
            default:
                System.out.println("Escolha uma ra�a correta");
                break;
        }
    }
    
  
    public void exibirNome() {
        System.out.println("Monstro " + this.retornarNome() + " apareceu!");
    }
    
}
