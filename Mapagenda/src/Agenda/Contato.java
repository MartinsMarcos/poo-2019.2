package Agenda;

import java.util.ArrayList;


public class Contato {

	public String nome;
	public boolean isFavorited;
	public ArrayList<Fone> fones = new ArrayList <Fone>();
	
	public Contato(String nome, Fone fone) {
		this.nome = nome;
		fones.add(fone);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return " Nome >>" +nome+ " Numeros>> " +fones+ "\n";
	}

	
	
//	public boolean addFone(String nome, String desc, String numero) {
//		int i;
//		int aux = 0;
//		boolean b = true;
//		Agenda ag = new Agenda();
//		
//		for(i=0; i<numero.length(); i++) {
//			if (Character.isDigit(numero.charAt(i)) == false){
//				b = false;
//				System.out.println("erro | numero inválido");
//				break;
//			}
//		}
//		
//		for(i=0; i<ag.contatos.size(); i++) {
//			if(ag.contatos.get(i).getNome().equals(nome)) {
//				aux = 1;
//			}
//		}
//		
//		
//		for(i=0; i<fones.size(); i++) {
//			if(fones.get(i).getNome().equals(nome)){
//				if(fones.get(i).getFoneid().equals(desc)) {
//					b = false;
//					System.out.println("erro | foneid já existe");
//					break;
//				}
//			}
//		}
//		
//		if(b==true) {
//			Contato nom = new Contato(nome);
//			ag.contatos.add(nom);
//			Fone fone = new Fone(nome,numero,desc);
//			fones.add(fone);
//			System.out.println("Contato cadastrado com sucesso");
//			return true;
//		}
//		
//		return false;
//	}
	
	
	}
	
