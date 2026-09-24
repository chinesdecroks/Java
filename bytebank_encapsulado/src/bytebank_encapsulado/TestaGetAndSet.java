package bytebank_encapsulado;

public class TestaGetAndSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getNumero());
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		//outra forma:
		
		Cliente donoDaConta = conta.getTitular();
		donoDaConta.setProfissao("programador");
		
		System.out.println(paulo);
		System.out.println(donoDaConta);
		System.out.println(conta.getTitular());
	}
}
