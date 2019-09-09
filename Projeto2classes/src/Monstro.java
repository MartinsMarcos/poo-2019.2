
public class Monstro extends Personagem {
    
    int experiencia;
    public Monstro() {
        // Zumbis, Humanos, Elfos e Goblins
    }
    
    public Monstro(int raca) {
        // Zumbis, Humanos, Elfos e Goblins
        switch (raca) {
            case 1:
                System.out.println("Raça: Zumbi");
                break;
            case 2:
                System.out.println("Raça: Humano");
                break;
            case 3:
                System.out.println("Raça: Elfo");
                break;
            case 4:
                System.out.println("Raça: Goblin");
                break;
            default:
                System.out.println("Escolha uma raça correta");
                break;
        }
    }
    
  
    public void exibirNome() {
        System.out.println("Monstro " + this.retornarNome() + " apareceu!");
    }
    
}
