package bytebank_herdado;

public class TesteReferencia {
	public static void main(String[] args) {
		
		//Gerente agnaldo = new Gerente();
		Gerente agnaldo = new Gerente();
		EditorDeVideo edson = new EditorDeVideo();
		Disigner robson = new Disigner();
		ControleBonificacao controle = new ControleBonificacao();
		
		agnaldo.setNome("Agnaldo Garcia");
		String nome = agnaldo.getNome();
		System.out.println(nome);
		
		agnaldo.setSalario(5000);
		edson.setSalario(2500);
		robson.setSalario(2000);
		
		controle.registra(agnaldo);
		controle.registra(edson);
		controle.registra(robson);
		
		System.out.println(controle.getSoma());
		
		
		
	}
}
