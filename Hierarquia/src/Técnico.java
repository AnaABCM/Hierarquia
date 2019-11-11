import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Tc")
public class T�cnico extends Pessoa {
	
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
