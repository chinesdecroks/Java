package bytecode;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public Conta(double saldo, int agencia, int numero, Cliente titular)
	{
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;

		if (titular == null)
			this.titular = new Cliente();
		else
			this.titular = titular;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}
	public boolean transfere(int valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	} 
	
	public double getSaldo() {
		return this.saldo;
	}
}