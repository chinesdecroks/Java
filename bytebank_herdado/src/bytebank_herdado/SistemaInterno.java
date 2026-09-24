package bytebank_herdado;

public class SistemaInterno {

	int senha = 2222;
	
	public void autentica(Autenticavel g) {
		boolean autenticou = g.autenticacao(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
	
}
