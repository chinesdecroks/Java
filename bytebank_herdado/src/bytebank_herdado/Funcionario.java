package bytebank_herdado;

//abstract = não pode instanciar objetos dessa classe pois ela é abstrata
public abstract class Funcionario {
	private String nome;
	private String cpf;
	// protected público para os filhos, heranças.
	//protected double salario;
	private double salario;
	
	//abstract método =  método sem corpo
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
