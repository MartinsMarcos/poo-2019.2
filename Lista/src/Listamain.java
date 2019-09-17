import java.util.ArrayList;
import java.util.Arrays;

public class Listamain {
	public static void showArray(ArrayList<String> array) {
		for (String elem: array)
			System.out.print(elem +" ");
		System.out.print("/n");
	}
	
	public static void main(String[] args) {
		ArrayList<String> cadeiras = new ArrayList <String>();
		cadeiras.add("Libras");
		System.out.print( "Adicionando a cadeira Libras: " );
        System.out.println( Arrays.toString( cadeiras.toArray() ) );
        
		cadeiras.add("POO");
		System.out.print( "Adicionando a cadeira POO: " );
        System.out.println( Arrays.toString( cadeiras.toArray() ) );
        
		cadeiras.add("CDP");
		System.out.print( "Adicionando a cadeira CDP: " );
        System.out.println( Arrays.toString( cadeiras.toArray() ) );
		
		cadeiras.add("matematicabasica");
		System.out.print( "Adicionando a cadeira matematicabasica: " );
        System.out.println( Arrays.toString( cadeiras.toArray() ) );
		
		
		//Arrays.toString(cadeiras.toArray());
		
		cadeiras.get(0);
		System.out.print( "Quem está na índice 0: " );
        
        
        
		cadeiras.size();
		cadeiras.remove("matematicabasica");
	
		
		
			
			
			

	}

}
