package exercicios;

import java.util.Scanner;

public class ProdutoDeTresInteiros {

	public static void main(String[] args) {
		
		/** 
		 * o programa calculará o produto de três interiros
		 *
		 */
		
		Scanner input = new Scanner(System.in); // instanciação da classe scanner 
		
		// declaração das variáveis
		int x, y, z, result;
		
		
		// aqui o usuario digitará três inteiros e esses valores serão atribuidos às variáveis
		System.out.println("Insira o primeiro inteiro: ");
		
		x = input.nextInt();
		
		System.out.println("Insira o segundo inteiro: ");
		
		y = input.nextInt();
		
		System.out.println("Insira o terceiro inteiro: ");
		
		z = input.nextInt();
		
		
		// operação de cálculo dos valores atribuídos às variáveis
		result = x*y*z;
		
		// exibe o resultado da operacão
		System.out.println("O produto é: " + result);
		
		
		
	}

}
