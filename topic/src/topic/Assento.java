package topic;

public class Assento {
	private char tipo;
	private Passageiro passageiro;
	
	public Assento(char tipo) {
		this.tipo = tipo;
		this.passageiro = null;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	
	public void rmPassageiro() {
		this.passageiro = null;
	}
	
	public boolean verificarPassageiro(String id) {
		if(passageiro == null) {
			return false;
		}
		if(id.equals(passageiro.getId())) {
			return true;
		} else {
			return false;
		}
	}
	
	//se o assento estier livre, retorna verdadeiro
	public boolean verificarAssento() {
		if(passageiro != null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		if(passageiro != null) {
			return passageiro.toString();
		} else {
			return ""+tipo;
		}
	}

}
