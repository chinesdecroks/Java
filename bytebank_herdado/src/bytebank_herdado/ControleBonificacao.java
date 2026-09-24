package bytebank_herdado;

public class ControleBonificacao {
	
	private double soma;
	
	/*polimorfismo = utilizar uma classe generica como parametro, sendo possivel inserir classes
	 * específicas como no caso do metodo registra, em que o paramentro sendo de tipo
	 * Funcionario é possivel inserir objetos de tipo que pertencem a classe Funcionario
	 * como Gerente e Edito de video, além de o metodo funcionar, ele identifica o tipo 
	 * de bonificacao de acordo com o tipo do objeto
	 */
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
