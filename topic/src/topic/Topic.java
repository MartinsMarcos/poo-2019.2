package topic;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	private int numAssentos;
	private List<Assento> assentos;
	
	public Topic(int numAssentos, int numPref) {
		this.numAssentos = 0;
		this.assentos = new ArrayList<Assento>();
	}
	
	public void inicializar(int numAssentos, int numPref) {
		for(int i = 0; i < numAssentos; i++) {
			if( i < numPref) {
				assentos.add(new Assento('@'));
			} else {
				assentos.add(new Assento('='));
			}
		}
	}

	public int getNumAssentos() {
		return numAssentos;
	}

	public void setNumAssentos(int numAssentos) {
		this.numAssentos = numAssentos;
	}

	public List<Assento> getAssentos() {
		return assentos;
	}

	public void setAssentos(List<Assento> assentos) {
		this.assentos = assentos;
	}
	
	public boolean verificarDisponibilidade() {
		for(Assento a : assentos) {
			if(a.verificarAssento()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean embarcar(String id, int idade) throws Exception{
		for(Assento a : assentos) {
			if(a.verificarPassageiro(id)){
				throw new Exception("fail: pass ja esta na topic");
			}
		}
		if(!this.verificarDisponibilidade()) {
			throw new Exception("fail: topic lotada");
		}
		
		if(idade >= 60) {
			for(Assento a : assentos) {
				if(a.verificarAssento()) {
					a.setPassageiro(new Passageiro(id, idade));
					return true;
				}
			}
		} else {
			for(Assento a : assentos) {
				if(a.getTipo() == '=' && a.verificarAssento()) {
					a.setPassageiro(new Passageiro(id, idade));
					return true;
				}
			}
			for(Assento a : assentos) {
				if(a.verificarAssento()) {
					a.setPassageiro(new Passageiro(id, idade));
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean desembarcar(String id) throws Exception{
		for(Assento a : assentos) {
			if(a.verificarPassageiro(id)) {
				a.setPassageiro(null);
				return true;
			}
		}
		throw new Exception("fail: pass nao esta na topic");
	}

	@Override
	public String toString() {
		return assentos.toString();
	}
	
	
	
}
