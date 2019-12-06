import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {
	protected String disciplinaID;
	Map<String, Aluno> alunos;

	public Disciplina(String disciplinaID) {
		super();
		this.disciplinaID = disciplinaID;
		alunos = new HashMap<String, Aluno>();

	}

	public void matricular(Aluno aluno) { 
		Aluno alu = alunos.get(aluno.getIdAluno());
		if (alu != null) {
			return;
		}
		alunos.put(aluno.idAluno, aluno);
		aluno.matricular(this);
	}

	public void desmatricular(String idAluno) {
		Aluno alu = alunos.get(idAluno);
		if (alu == null) {
			return;
		}
		alunos.remove(idAluno);
		alu.desmatricular(this.getDisciplina());
	}

	Collection<Aluno> getAlunos() {
		return alunos.values();
	}
	
        @Override
	public String toString() {
		return getDisciplina();
	}

	
	public String getDisciplina() {
		return disciplinaID;
	}

}