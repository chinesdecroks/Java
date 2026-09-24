package bytebank_herdado_conta;

public class TesteConta {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a/0;
		
		ContaCorrente outra = null;
		outra.deposita(200);
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
	
}
