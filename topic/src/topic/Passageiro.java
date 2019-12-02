package topic;

public class Passageiro {
	private String id;
	private int idade;
	
	public Passageiro(String id, int idade) {
		this.id = id;
		this.idade = idade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return " "+id + ":" + idade;
	}
}
