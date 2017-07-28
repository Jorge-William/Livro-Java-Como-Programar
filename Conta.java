package construtoresClasseConta;

public class Conta {
	// variaveis de instância
	private double saldo;
	private String nome;
		
	
	// metodo construtor
	public Conta(String nome, double saldo ){
		this.nome = nome;
		
		if (saldo > 0.0){ // se o saldo existir (nao for negativo)
			this.saldo = saldo;// stribui o valor do saldo a variavel saldo
		}else{
			System.out.println("O saldo é negativo");
		}
	}
	
	public void deposita(double quantDeposito){
		if(quantDeposito > 0.0){
			saldo = saldo + quantDeposito;// atualiza o saldo somando o saldo com o deposito
		}else{
			System.out.println("O depósito tem que conter de um valor positivo!!!!");
		}
	}
	
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
}
