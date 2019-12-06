import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repositorio <RepMatricula>{
	protected String nome;
	Map<String, RepMatricula> mapa;
	
	public Repositorio(String nome) {
		super();
		this.nome = nome;
		mapa = new HashMap<String, RepMatricula>();
	}

	public void add(String key, RepMatricula data) {
		RepMatricula temp = mapa.get(key);
		if(temp == null)
			mapa.put(key, data);
		else
			throw new RuntimeException(nome + " " + key + " ja existe");
	}
	
	
	
	@Override
	public String toString() {
		return "" + mapa;
	}
	
	Collection<T> getAll() {
		return mapa.values();
	}
		
}
