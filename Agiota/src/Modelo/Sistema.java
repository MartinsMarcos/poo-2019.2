package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	
	private float balanco;
	private int nextId = 0;
	int clientes = 1;
	public ArrayList <Transacao> transacoes = new ArrayList <Transacao>();
	Scanner in = new Scanner(System.in);

	public Sistema(float balanco) {
		this.balanco = balanco;
		this.transacoes = new ArrayList<>();
	}

	public void setBalaco(float balanco) {
		this.balanco = balanco;
	}
	public float getBalanco() {
		return balanco;
	}
	
	
	public void addTran(String nome, float valor) {
		boolean b = false;
		Transacao tran = new Transacao(nextId, nome, valor);
		
		if(valor<0 && valor*(-1)<=balanco) {
			balanco -= valor*(-1);
			transacoes.add(tran);
			nextId++;
			System.out.println("Sucesso ao realizar emprestimo!");
			System.out.println("Transacao " +nextId+ " adicionada");
		}
		else if(valor > 0) {
			balanco += valor;
			transacoes.add(tran);
			nextId++;
			System.out.println("Sucesso ao fazer pagamento");
			System.out.println("Transacao " +nextId+ " adicionada");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		if(transacoes.size()>1) {
			for(int i = 0; i<transacoes.size()-1; i++){
				if(transacoes.get(i).getNome().equals(nome)) {
					b = true;
				}
			}
			
			if(b==false) {
				clientes++;
			}
		}
	}
	
	public void Mostrar() {
		for (Transacao t : transacoes) {		
			System.out.println(t);
		}
	}
	
	
	public void mostraCli(String cliente) {
		float saldoC = 0 ;
		for(int i=0; i<transacoes.size(); i++){
			if(transacoes.get(i).getNome().equals(cliente) ){
				saldoC = saldoC + transacoes.get(i).getValor();
				System.out.println(transacoes.get(i));
			}
		}
		if(saldoC>0) {
			System.out.println("Saldo: R$ " +saldoC*(1));
		}
		else if(saldoC<0){
			System.out.println("Saldo: R$ " +saldoC*(-1));
		}
		else {
			System.out.printf("Saldo: R$ %.0f\n", saldoC);
		}
	}
	
	
	public void fazerBalanco(){
		System.out.println(getBalanco());
	}
	
	
	public int contarClientes() {
		
		return clientes;
	}
	
	
	public boolean rmTran () {
		int ID;
		System.out.println("Insira o id que deseja remover na transacao");
		ID = in.nextInt();
		
		for(int i=0; i<transacoes.size(); i++){
			if(transacoes.get(i).getId() == ID ){
				transacoes.remove(i);
				System.out.println("id removido");
				return true;
			}
		}
		
		System.out.println("id nao encontrado");
		
		return false;
	}
	

	public void removerALL () {
		transacoes.removeAll(transacoes);
	}
	
	
	
}
