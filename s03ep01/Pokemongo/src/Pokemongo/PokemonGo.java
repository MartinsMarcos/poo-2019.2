package Pokemongo;
public class PokemonGo {



	public static void main (String []args) 
	{ Pokemon poke = new Pokemon("Pikachu", "eletrico", "18")
	
	poke.setForca (78);
	
	String a[] = new String [5];
	a[0] = "cabecada";
	a[1] = "Chute";
	a[2] = "Joelhada";
	a[3] = "Choque do trovão";
	a[4] = "raio";
	
	
	
	poke.setAtaques (a);
	
	poke.imprecaoAtaques();
	poke.posAtaque("chute");
	System.out.println("poscaoAtaques"+ pos);
	
	poke.nomeAtaques(1);
	
	}

}