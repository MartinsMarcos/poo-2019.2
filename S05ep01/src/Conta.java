
public class Conta {
	private String titular;
	private String numero;
	private double saldo; 
	int id;	
	static int identificador = ();
				
		}
		public Conta (string titular, int numero, double saldo ) {
			this.titular = titular;
			this.numero = numero;
			this.saldo = saldo;
			
		public Conta () {
			this.id = identificador;
			identificador +=1;
				
		}
			
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	

}
