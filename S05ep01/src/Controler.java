
public class Controler {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta ();
		System.out.println(conta2.identificador);
		
		Conta conta3 = new Conta (String titular);
		
		Conta conta2 = new Conta ();
		conta2.setTitular("Marcos");
		System.out.println(conta2.getTitular());
		conta2.setSaldo(100);
		System.out.println(conta2.getSaldo());
		conta2.setNumero("1425135");
		System.out.println(conta2.getNumero());
		
	}

}
