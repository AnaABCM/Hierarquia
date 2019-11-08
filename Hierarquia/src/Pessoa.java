
public class Pessoa implements Identificavel {
	
	private Long Id;
	private Long Matricula;
	private String Nome;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
