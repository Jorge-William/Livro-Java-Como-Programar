package capitulo_2;

import java.util.Scanner;

public class Adicao {
	public static void main(String  []args){
		// cria um Sacenner para obter entrada a partir da janela de comando
		Scanner teclado = new Scanner(System.in);
		
		int numero1; // primeiro numero a somar
		int numero2; // segundo numero a somar
		int soma; // soma de numero1 + numero2
		
		System.out.print("Digite um n�mero: ");  // invoca a msg para o usuario digitar um numero
		
		numero1 = teclado.nextInt();  // aqui ser� armazenado o segundo numero
		
		System.out.print("Digite o segundo n�mero: ");  // invoca a msg para o usuario digitar um numero
		
		numero2 = teclado.nextInt();  // aqui ser� armazenado o segundo numero
		
		soma = numero1 + numero2;
		
		System.out.println("A soma do 1� n�mero com o 2� n�mero �: " + soma );
	}
}
