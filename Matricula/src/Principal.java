import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
		Repositorio<Aluno> repoalu = new Repositorio<Aluno>("Aluno");
		Repositorio<Disciplina> repodis = new Repositorio<Disciplina>("Disciplina");

		Scanner opcao = new Scanner(System.in);

		while (true) {
			System.out.println("addalu(nome) | adddis(nome) | matricular(nome,disciplina) | desmatricular (nome,disciplina) | remover (nome) | show");
			String op = opcao.nextLine();
			String[] vet = op.split(" ");

			try {
				if (vet[0].equalsIgnoreCase("end")) { 
					break;
				} else if (vet[0].equals("addalu")) {
					for (int i = 1; i < vet.length; i++)
						repoalu.add(vet[i], new Aluno(vet[i]));

				} else if (vet[0].equals("adddis")) {
					for (int i = 1; i < vet.length; i++)
						repodis.add(vet[i], new Disciplina(vet[i]));

				} else if (vet[0].equals("matricular")) {
					for (int i = 2; i < vet.length; i++)
						repoalu.get(vet[1]).matricular(repodis.get(vet[i]));

				} else if (vet[0].equals("desmatricular")) {
					for (int i = 2; i < vet.length; i++) {
						repoalu.get(vet[1]).desmatricular(repodis.get(vet[i]).getIdDisciplina());
					}	
				} else if (vet[0].equals("show")) {
					System.out.println("Alunos: ");
					for (Aluno aluno : repoalu.getAll()) {
						System.out.println(" " + aluno.getIdAluno() + aluno.getDisciplinas());
					}
					System.out.println("Disciplinas: ");
					for (Disciplina disciplina : repodis.getAll()) {
						System.out.println(" " + disciplina.getIdDisciplina() + disciplina.getAlunos());
					}
				}
				
				}else {
					System.out.println("Valor invalido");
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Informações incompleta");
			}catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}

    
}
