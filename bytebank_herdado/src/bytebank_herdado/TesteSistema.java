package bytebank_herdado;

public class TesteSistema {
	public static void main(String[] args) {
		
		Gerente gustavo = new Gerente();
		gustavo.setSenha(2222);
		
		Administrador jorge = new Administrador();
		jorge.setSenha(2122);
		
		Cliente juliano = new Cliente();
		juliano.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gustavo);
		si.autentica(jorge); 
		si.autentica(juliano);
		
	}
}
