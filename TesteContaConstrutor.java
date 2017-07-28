package construtoresClasseConta;

import java.util.Scanner;

public class TesteContaConstrutor {
	public static void main(String[] args) {
		
		try {
			Conta cont1 = new Conta("Jorge William - ", 1000.);
			Conta cont2 = new Conta("Adriana Silva - ", 5000.);
			
			System.out.println( cont1.getNome() + "Saldo: " + cont1.getSaldo());
			System.out.println( cont2.getNome() + "Saldo: " + cont2.getSaldo());

			Scanner  input = new Scanner(System.in);
			
			System.out.println("Entre com o valor do depósito: ");
			double quantDeposito = input.nextDouble();
			System.out.println("Acrescentando à conta!!! " + quantDeposito);
			
			cont1.deposita(quantDeposito);
			
			System.out.println("Saldo: " + cont1.getNome() + cont1.getSaldo());
			System.out.println("Saldo: " + cont2.getNome() + cont2.getSaldo());
			
			System.out.println("Entre com a quantidade para conta 2: ");
			quantDeposito = input.nextDouble();
			
			System.out.println("Acrescentando à conta!!! " + quantDeposito);
			cont2.deposita(quantDeposito);
			
			System.out.println("Saldo: " + cont1.getNome() + cont1.getSaldo());
			System.out.println("Saldo: " + cont2.getNome() + cont2.getSaldo());
		} catch (Exception InputMismatchException) {
			// TODO Auto-generated catch block
			System.out.println("Formato de numero errado!!!");
		}
		
	}

}
