package s03ep01;

public class Ventilador {
	boolean estaLigado;
	int velocidade;
	boolean estaGirando;
	
	
	void ligar () 
	{	if(estaLigado == false) 
		System.out.println("Ligando o ventilador");
		estaLigado = true;
	
				
	}
	void desligar()
	{ if (estaLigado == true)
	  System.out.println("Desligando o ventilador");
		estaLigado = false;
	
		
	}
	void girar() 
	{if (estaGirando == false)
		System.out.println("fazendo girar");
		estaGirando = true;
		
		
	}
	
	void pararDeGirar()
	{ if (estaGirando == true )
		System.out.println("parando de girar");
		estaGirando = false;
	
	}
	
	void aumentarVelocidade()
	{ if (velocidade < 3 )
		System.out.println("aumentando 1 nivel da velocidade");
		velocidade = + 1;
	
	}
	
	void diminuirVelocidade()
	{ if (velocidade > 0)
		System.out.println("diminuir 1 nivel da velocidade");
		velocidade = - 1;
	
	}
	
	
	
	void showStatus() {
		System.out.println("Ligado: " + estaLigado + 
						   ", vel: " + 	velocidade + 
						   ", girando: " + estaGirando);
	}
	
	public static void main(String[]args) {
		Ventilador arno = new Ventilador();
		arno.showStatus();
		arno.ligar();
 }

}
