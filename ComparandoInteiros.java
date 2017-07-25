
import java.util.Scanner;

public class ComparandoInteiros {
	public static void main(String []args) {
	
	Scanner input = new Scanner(System.in);
		
	int num1, num2, soma, produto, quociente, diferenca;
		
	System.out.println("Digite o primeiro número: ");
	num1 = input.nextInt();
	
	System.out.println("Digite o segundo número: ");
	num2 = input.nextInt();
	
	
	soma = num1 + num2;
	produto = num1 * num2;
	diferenca = num1 - num2;
	quociente = num1 / num2;
	
	System.out.println("A Soma é:  " + soma);
	System.out.println("O produto é: " + produto);
	System.out.println("A diferença é: " + diferenca);
	System.out.println("O quociente é: " + quociente);
	
	}
}
