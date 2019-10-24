package Agenda;

public class Fone {
	public String foneid;
	public String numero;
	
	
	public Fone (String numero, String desc) {
		this.numero = numero;
		this.foneid = desc;
	}
	
	public String getFoneid() {
		return foneid;
	}
	public void setFoneid(String foneid) {
		this.foneid = foneid;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		
		this.numero = numero;
	}
	
	
	public String toString() {
		return "Numero>> "+numero+" Desc>> "+foneid;
	}

}
