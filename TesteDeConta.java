package conta;

import java.util.Scanner;

public class TesteDeConta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // cria novo objeto scanner para pegar o que � digitado no teclado
		
		Conta minhaConta = new Conta(); // cria novo objeto conta
		
		System.out.println("O nome padr�o da conta �: " + minhaConta.getNome()); 
		
		System.out.println("Por favor digite um novo nome para conta: ");
		
		String oNome = input.nextLine(); // associa o que for digitado � vari�vel oNome
		
		minhaConta.setNome(oNome);
		
		System.out.println("O nome da conta �: " + minhaConta.getNome());

	}

}
