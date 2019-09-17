
public class Grafites {
	private String ponta;
	private String tamanho;
	
	public Grafites(String ponta, String tamanho) {
		super();
		this.ponta = ponta;
		this.tamanho = tamanho;
	}

	public String getPonta() {
		return ponta;
	}

	public void setPonta(String ponta) {
		this.ponta = ponta;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Grafites [ponta=" + ponta + ", tamanho=" + tamanho + "]";
	}
}
