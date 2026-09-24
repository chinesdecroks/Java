package bytebank_herdado;

public class TesteGerente {
	public static void main(String[] args) {
		
		
		Gerente giuliano = new Gerente();
		
		Gerente humberto = new Gerente();
		humberto.setNome("Humbeto da Silva");
		humberto.setCpf("123.456.789-01");
		humberto.setSalario(5000);
		
		System.out.println(humberto.getNome());
		System.out.println(humberto.getCpf());
		System.out.println(humberto.getSalario());
		
		humberto.setSenha(2222);
		
		boolean autenticou = humberto.autenticacao(2222);
		System.out.println(autenticou);
		System.out.println(humberto.getBonificacao());
	}
}
