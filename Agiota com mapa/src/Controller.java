import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Sistema sistema = new Sistema(0);
        Scanner scanner = new Scanner(System.in);

        while (true){
            String line =  scanner.nextLine();
            String[] ui = line.split(" ");
            try {
                if (ui[0].equals("end")) {
                    break;
                } else if (ui[0].equals("init")) {
                    sistema = new Sistema(Float.parseFloat(ui[1]));
                } else if (ui[0].equals("show")) {
                    System.out.println(sistema);
                } else if (ui[0].equals("emprestar")) {
                    sistema.emprestar(ui[1], Float.parseFloat(ui[2]));
                } else if (ui[0].equals("cadastrar")) {
                    String id = ui[1];
                    String fullname = " ";
                    for (int i = 2; i < ui.length; i++) {
                        fullname += ui[i] + " ";
                    }
                    fullname.substring(0, fullname.length() - 1);
                    sistema.cadastrar(new Cliente(id, fullname));
                } else if (ui[0].equals("historico")) {
                    ArrayList<Transacao> hist = sistema.getHistorico();
                    for (Transacao tr : sistema.getHistorico())
                        System.out.println(tr);
                } else {
                    System.out.println("comando invalido");
                }
            }catch (RuntimeException re){
                System.out.println(re.getMessage());
            }
        }
    }
}
