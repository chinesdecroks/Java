
package sintaxe_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("O valor de acompanhado = " + acompanhado);

// && = todas as condições devem ser verdadeiras
// || = apenas uma das condições devem ser verdadeiras
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo");
			
		} else {

			System.out.println("Infelizmente você não pode entrar");

		}

	}
}
