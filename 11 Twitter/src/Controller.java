import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema =  new Sistema();

        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");

            try {
                if (ui[0].equals("end"))
                    break;
                else if (ui[0].equals("addUser")) {
                    sistema.addUsuario(ui[1]);
                } else if (ui[0].equals("show")) {
                    System.out.println(sistema);
                } else if (ui[0].equals("seguir")) {
                    Usuario one = sistema.getUsuario(ui[1]);
                    Usuario two = sistema.getUsuario(ui[2]);
                    one.seguir(two);
                }
            } catch (RuntimeException rt) {
                System.out.println(rt.getMessage());
            }
        }
    }
}
