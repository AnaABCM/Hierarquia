import java.util.Random;

public class Main {

	private static Random r = new Random();

	public static void main(String[] args) {

		long inicio2 = System.currentTimeMillis();

		DAO<Pessoa> daoP = new DAO<Pessoa>();
		DAO<Aluno> daoA = new DAO<Aluno>();
		DAO<Professor> daoPf = new DAO<Professor>();
		DAO<Técnico> daoT = new DAO<Técnico>();

		Pessoa nomeA = daoP.find(Pessoa.class, 524l);
		Aluno nomeB = daoA.find(Aluno.class, 77l);
		Professor nomeC = daoPf.find(Professor.class, 3l);
		Técnico nomeD = daoT.find(Técnico.class, 2l);

		long fim2 = System.currentTimeMillis();
		System.out.println(fim2 - inicio2);

		long inicio3 = System.currentTimeMillis();

		daoP.remove(nomeA);
		daoA.remove(nomeB);
		daoPf.remove(nomeC);
		daoT.remove(nomeD);

		long fim3 = System.currentTimeMillis();
		System.out.println(fim3 - inicio3);

	}

}
