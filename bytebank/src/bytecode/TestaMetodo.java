package bytecode;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLucas = new Conta();
		contaDoLucas.saldo = 100;
		contaDoLucas.deposita(50);
		System.out.println(contaDoLucas.saldo);
		
		boolean conseguiuRetirar = contaDoLucas.saca(120);
		System.out.println(contaDoLucas.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaBeatriz = new Conta();
		contaDaBeatriz.deposita(1000);
		if (contaDaBeatriz.transfere(300, contaDoLucas)) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Não foi possível realizar a transferência");
		}
		System.out.println(contaDoLucas.saldo);
		System.out.println(contaDaBeatriz.saldo);
		
		contaDoLucas.titular = "Lucas G Oliveira";
		System.out.println(contaDoLucas.titular);
	}
}
