import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa implements Identificavel {
	
	@Id
	private Long IdPs;
	private Long Matricula;
	private String Nome;
	private String Tipo;

	public Long getIdPs() {
		return IdPs;
	}
	public void setIdPs(Long idPs) {
		IdPs = idPs;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
	public Long getId() {
		return IdPs;
	}
	public void setId(Long id) {
		IdPs = id;
	}
	public Long getMatricula() {
		return Matricula;
	}
	public void setMatricula(Long matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

}
