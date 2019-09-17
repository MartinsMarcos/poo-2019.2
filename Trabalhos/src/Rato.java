import java.util.Scanner;

class MeuRato{
	String nome;
	String doenca;
	boolean doente;
	int velocidade;
	boolean correr;
	
	
	void daNome (String nome) {
		this.nome = nome;
		System.out.println("Nome do Rato: "+this.nome);
	}
	void nomearDoenca (String doenca) {
		this.doenca = doenca;
		this.doente = true;
		if (this.doenca == null) {
			System.out.println("Doenca nao indentificada");
		}
	}
	
	void estaDoente () {
		if (doente == true) {
			System.out.println("Rato contaminado");
		}else {
			System.out.println("Rato saudável");
			this.doente = false;
		}
	}
	
	void qualVelocidade(int velocidade){
		this.velocidade = velocidade;
		if (this.velocidade > 0) {
			this.correr = true;
		}
	}
	
	void correndo () {
		if (correr == true) {
			System.out.println("Esta correndo o rato");	
		}else {
			System.out.println("Esta parado o rato");
		}		
	}
	
	public String toString() {
		String str = "";
		str += ("Nome do Rato: "+this.nome);
		str+= ("Nome da doença: "+this.doenca);
		return str;
		
	}



public class Rato {
	public void main(String[] args) {
		MeuRato ratinho = new MeuRato();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String line = scan.nextLine();
			String[] ui = line.split(" ");
            if (ui[0].equals("sair")){
                break;
            }else if (ui[0].equals("show")) {
            	System.out.println(ratinho);
            }else if (ui[0].equals("nome")) {
            	ratinho.daNome(ui[1]);
            }else if(ui[0].equals("doenca")) {
            	ratinho.nomearDoenca(ui[1]);
            }else if(ui[0].equals("diagnostico")) {
            	ratinho.estaDoente();
            }else if(ui[0].equals("fugindo")) {
            	ratinho.correndo();
            	}
            }
		}
	}
}