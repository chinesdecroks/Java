package bytebank_herdado;

/*Gerente é um Funcionario / Gerente herda da classe Funcionario
 *Gerente assina a interface funcionario e implementa seus metodos
 */
public class Gerente extends Funcionario implements Autenticavel {

	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	/* reescrita metodo bonificacao, com mesmo retorno, double, 
	 * mesma assinatura, getBonificacao e mesmos parâmetros, ().*/
	//super = utilizado para indicar atributo da classe mãe, da super classe, base class.
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autenticacao(int senha) {
		return this.autenticador.autenticacao(senha);

}
}