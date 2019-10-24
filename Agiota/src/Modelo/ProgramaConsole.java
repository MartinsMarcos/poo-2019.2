package Modelo;
import java.util.Scanner;

public class ProgramaConsole {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Sistema sistema = null;
		boolean sair = false;
		
		while (!sair) {
			System.out.print(">>");
			String linha = in.nextLine();
			String[] comando = linha.split(" ");
			String operacao = comando[0];
			switch (operacao) {
			
			case "iniciar":
				float valorI = Float.parseFloat(comando[1]);
				sistema = new Sistema(valorI);
				System.out.println("Sistema iniciado com R$ " +valorI);
				break;
			case "addTran":
				if(sistema!=null){
					String nome = comando[1];
					float valorAdd = Float.parseFloat(comando[2]);
					sistema.addTran(nome, valorAdd);
				}else{
					System.out.println("Você precisa iniciar o sistema!");
				}
				break;
			case "showTran":
				if(sistema!=null){
				sistema.Mostrar();
				}
				else {
					System.out.println("Ainda nao foi realizada nenhuma transacao");
				}
				break;
			case "showCli":
				if(sistema!=null){
				String nome = comando[1];
				sistema.mostraCli(nome);
				}
				break;
			case "fazerBalanco" :
				if(sistema != null){
					sistema.fazerBalanco();
				}
				break;
			case "rmTran" :
				if(sistema != null) {
					sistema.rmTran();
				}
				break;
			case "contarClientes" :
				if(sistema != null) {
					System.out.println("Existe " +sistema.contarClientes()+ " cliente(s) cadastrados");
				}
				break;
			default:
				System.out.println("Comando não encontrado!");
				break;
			}
		}
	}
}