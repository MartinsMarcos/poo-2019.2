import java.util.ArrayList;

public class Lapiseira {
	private String marca;
	private String ponta;
	private ArrayList<Grafites> grafites;
	
	public Lapiseira(String marca, String ponta) {
		super();
		this.marca = marca;
		this.ponta = ponta;
		this.grafites = new ArrayList<>();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPonta() {
		return ponta;
	}

	public void setPonta(String ponta) {
		this.ponta = ponta;
	}

	public ArrayList<Grafites> getGrafites() {
		return grafites;
	}

	public void setGrafites(ArrayList<Grafites> grafites) {
		this.grafites = grafites;
	}
	
	public void addGrafite(String ponta, String tamanho) {
		if(this.ponta==ponta) {
			this.grafites.add(new Grafites(ponta, tamanho));
		}
		else {
			System.out.println("Grafite incompativel");
		}
	}

	@Override
	public String toString() {
		return "Lapiseira [marca=" + marca + ", ponta=" + ponta + ", grafites=" + grafites + "]";
	}
	
	
	
}
