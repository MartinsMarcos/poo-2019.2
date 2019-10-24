package Agenda;

import java.util.ArrayList;


public class Agenda {

	public ArrayList <Contato> contatos = new ArrayList <Contato>();
	public ArrayList <Contato> favoritos = new ArrayList <Contato>();
	
	public String toString() {
		return "Agenda >>"+contatos;
	}
	
//	public boolean addContato(String nome) {
//		Contato c = new Contato(nome);
//		
//		for(int i=0; i<contatos.size(); i++) {
//			if(contatos.get(i).getNome().equals(nome)){
//				System.out.println("Contato ja existe");
//				return false;
//			}
//		}	
//			contatos.add(c);
//			System.out.println("Contato adicionado");
//			return true;
//		}
//	
	//public boolean rmContato(String nome) {
//		
//		for(int i=0; i<contatos.size(); i++) {
//			if(contatos.get(i).getNome().equals(nome)){
//				Contato c = new Contato(contatos.get(i).getNome());
//				contatos.remove(c);
//				System.out.println("Contato removido");
//				return true;
//			}
//		}	
//			System.out.println("Contato nao existe");
//			return false;
//	}
	
	
}
	

	

