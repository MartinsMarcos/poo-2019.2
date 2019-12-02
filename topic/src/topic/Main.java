package topic;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Topic top = new Topic(0, 0);
		
		System.out.println(top);
		
		String opt;
		
		String param[] = null;
		
		do {
			opt = scan.nextLine();
			param = opt.split(" ");
			
			switch(param[0]) {
				case "init":
					top.inicializar(Integer.parseInt(param[1]), Integer.parseInt(param[2]));
				break;
				
				case "show":
					System.out.println(top);
				break;
				
				case "in":
				try {
					top.embarcar(param[1], Integer.parseInt(param[2]));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println(e1.getMessage());
				}
					
				break;
					
				case "out":
					try {
						top.desembarcar(param[1]);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				break;
				
				case "sair":
				break;
				
				default:
					System.out.println("fail: opção inválida");
				break;
			}
		} while (!param[0].equals("sair") );
		
	}

}
