package entidades;

public class Conta {
	private int numeroConta;
	private String nome;
	private double saldo;
	//constructores
	public Conta(int numeroConta, String nome, double depInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depInicial);
	}
	
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	//gettes e settes
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	//métodos
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	
	public String toString() {
		return "Dados da conta:"
				+"\nConta: "+numeroConta+", Proprietário: "+nome+", Saldo R$: "+String.format("%.2f", saldo);
	}
	
	
	public void saque(double valor) {
		this.saldo -=  (valor + 5);
	}
}
