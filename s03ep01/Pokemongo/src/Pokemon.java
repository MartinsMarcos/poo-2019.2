
	public class Pokemon {
		this.nome = nome;
		this.tipo = tipo;
		this.level = level;
		
	}
	
	public String[] getAtaques() {
			return ataques;
		}
	public void setAtaques(String[] ataque) {
		this.ataque = ataques;
	}
	public int getForca() {
		return forca;
	}	
	public void setForca(int forca) {
		this.forca = forca;
	}

	public void imprecaoAtaques( ) {
		System.out.println("Ataques");
		for ( int pos == 0; pos < ataques.length; pos ++ ) {
			System.out.println(ataques[pos]);
			
	public int posAtaque (String n) {
		int r = -1;
		for ( int pos == 0; pos < ataques.length; pos ++ ) {
			System.out.println(ataques[pos]);
			if (n == ataques[pos]) {
				return pos;	
				
			}
				
		}
		if (r != -1 ) {
			return r;
		
		}
			
		public void nomeAtaques(int p) {
			System.out.println("Nome do ataque" + ataques[p]);
		}
	}
	
	
	public String nome;
	public String tipo;
	public int level;
	private int forca;
	private String ataques[] = new String[5];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
