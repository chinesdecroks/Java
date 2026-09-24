package bytecode;
import java.util.Random;

public class Cliente {
	String nome;
	String cpf;
	String profissao;
	private Random random = new Random();
	private int rand = random.nextInt(100000);

	public Cliente()
	{
		this.nome = "Usuário@" + rand;
		this.cpf = "XXX.XXX.XXX-XX";
		this.profissao = "NotDef";
	}

	public Cliente(String name, String cpf, String profissao)
	{
		this.nome = name;
		this.cpf = cpf;
		this.profissao = profissao;
	}
}
