package bytebank_herdado_conta;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente bernardo = new ContaCorrente(1234, 123443);
		bernardo.deposita(100);
		
		SeguroDeVida geovana = new SeguroDeVida();
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		
		ci.registra(bernardo);
		ci.registra(geovana);
		
		System.out.println(ci.getTotalImposto());
		
	}
}
