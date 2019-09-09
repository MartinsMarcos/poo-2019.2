


public class Personagem {
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getRaca() {
		return raca;
	}

	public void setRaca(int raca) {
		this.raca = raca;
	}

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
