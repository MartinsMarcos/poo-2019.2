package Agenda;

public class Principal {
	public static void main(String[] args) {
		Fone fones = new Fone(null, null);
		String nome = "Max";
		String foneid = "Casa";
		fones.setFoneid(foneid);
		String numero = "88787878";
		fones.setNumero(numero);
	
		Contato c1 = new Contato(nome, null);
		
		c1.fones.add(fones);
		Fone fones2 = new Fone(null,null);
		numero = "666";
		foneid = "escritorio";
		fones2.setNumero(numero);
		fones2.setFoneid(foneid);
		
		c1.fones.add(fones2);
		
		Agenda agenda = new Agenda();
		
		agenda.contatos.add(c1);
		
		nome = "marcos";
		Contato c2 = new Contato(nome, null);
		agenda.contatos.add(c2);
		
		System.out.println(agenda);
		
		
	}
}
