import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="IdPs")
public class Técnico extends Pessoa {
	
	private String Formacao;
	private Long Salario;
	
	public String getFormacao() {
		return Formacao;
	}
	public void setFormacao(String formacao) {
		Formacao = formacao;
	}
	public Long getSalario() {
		return Salario;
	}
	public void setSalario(Long salario) {
		Salario = salario;
	}
}
