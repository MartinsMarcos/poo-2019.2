import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Aluno {
	protected String alunoID;
	
        
        Map<String, Disciplina> disciplinas;

	public Aluno(String alunoID) {
		
		this.alunoID = alunoID;
		disciplinas = new HashMap<>();
	}

    /**
     *
     * @param disciplina
     */
        
     public void desmatricular(String idDisciplina) {
		Disciplina disci = disciplinas.get(idDisciplina);
		if (disci == null) {
			return;
		}
		disciplinas.remove(idDisciplina);
		disci.desmatricular(this.getAluno());
	}

	Collection<Disciplina> getDisciplinas() {
		return disciplinas.values();
	}
    public void matricular(Disciplina disciplina) {
		Disciplina disci = disciplinas.get(disciplina.idDisciplina);
		if (disci != null) {
			return;
		}
		disciplinas.put(disciplina.getIdDisciplina(), disciplina);
		disciplina.matricular(this);
	}

	

    /**
     *
     * @return
     */
    @Override
	public String toString() {
		return getAluno();
	}
	
	public String getAluno() {
		return alunoID;
	}

}