package sintaxe_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado;
		//boolean acompanhado = quantidadePessoas >= 2;
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else{
			acompanhado = false;
		}
		
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
