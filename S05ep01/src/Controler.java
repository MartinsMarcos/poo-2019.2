
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Opções: iniciar [nome, saldo], sacar [valor], depositar [valor], transferir [id e valor], status, fim");
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("fim")){
                System.out.println("Encerrando ...");
                break;
            } else if (ui[0].equals("iniciar")){
                conta = new Conta(ui[1], Integer.parseInt(ui[2]));
                System.out.println("Conta iniciada com sucesso!\n" + conta);
            } else if (ui[0].equals("status")) {
                System.out.println(conta);
            } else if (ui[0].equals("sacar")){
                conta.sacar(Integer.parseInt(ui[1]));
            } else if (ui[0].equals("depositar")) {
                conta.depositar(Integer.parseInt(ui[1]));
            } else if (ui[0].equals("tranferir")) {
                conta.tranferir(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
                conta.receber(Integer.parseInt(ui[1]));
            }
        }
    }
}