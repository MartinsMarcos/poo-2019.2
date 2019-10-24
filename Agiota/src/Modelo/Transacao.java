package Modelo;

public class Transacao {
	
	public int id = 0;
	private String nome;
	private float valor = 0;
	
	public Transacao(int id, String nome, float valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public String toString(){
		return ("id: " + id + ", Nome: "+ nome+", Valor: R$ "+valor);
	}
	}