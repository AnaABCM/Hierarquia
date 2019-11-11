import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Al")

public class Aluno extends Pessoa {
	
	private String Curso;
	private String Turma;
	
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	public String getTurma() {
		return Turma;
	}
	public void setTurma(String turma) {
		Turma = turma;
	}
}
