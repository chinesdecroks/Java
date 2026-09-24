package bytebank_herdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Gerente lucas = new Gerente();
		lucas.setNome("Lucas Gomes");
		lucas.setCpf("737.733.632-12");
		lucas.setSalario(2600.00);
		System.out.println(lucas.getNome());
		System.out.println(lucas.getBonificacao());
		
		//lucas.salario = 200;
	}
}
