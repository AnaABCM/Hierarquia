import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Ps")

public class Pessoa implements Identificavel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPs;
	private Long Matricula;
	private String Nome;
	
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
