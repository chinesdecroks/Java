package bytebank_herdado;

//Gerente é um funcionário / Gerente herda da classe Funcionário
public class Disigner extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do DISIGNER");
		return 200;
	}
	

}
