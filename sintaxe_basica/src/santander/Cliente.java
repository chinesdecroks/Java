package santander;

public class Cliente {
    String nome, endereco;
    Conta contaCorrente;

    public Cliente(String name, String addr, float saldo)
    {
        this.nome = name;
        this.endereco = addr;
        contaCorrente = new Conta(saldo);
    }

    String getNome() { return this.nome; }
    String getEndereco() { return this.endereco; }

}
