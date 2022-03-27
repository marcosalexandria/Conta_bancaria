package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Número da conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.print("Nome do proprietario: ");
		scanner.nextLine();
		String nome = scanner.nextLine();
		
		System.out.print("Deseja fazer um depósito incial na sua conta? (s/n) ");
		char esc = scanner.next().charAt(0);
		double saldo;
		
		Conta conta;
		
		if(esc == 's') {
			System.out.print("Qual o valor de depórito? ");
			saldo = scanner.nextDouble();
			
			conta = new Conta(numeroConta, nome, saldo);
			System.out.println();
			System.out.println(conta.toString());
			System.out.println("\nDeseja fazer um depósito? (s/n) ");
			esc = scanner.next().charAt(0);
			
			if(esc == 's') {
				
				System.out.print("Valor de depósito R$: ");
				double deposito = scanner.nextDouble();
				conta.deposito(deposito);
				
				System.out.print("\nDeseja ver os dados da conta atualizados? (s/n) ");
				esc = scanner.next().charAt(0);
				if(esc == 's') {
					System.out.println();
					System.out.println("Dados  da conta atualizados: \n"+conta.toString());
				}else {
					System.out.println("FIM DA OPERAÇÃO");
				}
			}
			
			System.out.print("Deseja sacar alguma quantia? (s/n)");
			esc = scanner.next().charAt(0);
			if(esc == 's') {
				System.out.print("\nDigite o valor que deseja sacar R$: ");
				double saque = scanner.nextDouble();
				conta.saque(saque);
				System.out.println("Saque realizado!");
				
				System.out.println("\nDeseja ver os dados da conta atualizados? (s/n) ");
				esc = scanner.next().charAt(0);
				if(esc == 's') {
					System.out.println();
					System.out.println("Dados  da conta atualizados: \n"+conta.toString());
				}else {
					System.out.println("FIM DA OPERAÇÃO");
				}
			}
			
			
		}else {
			conta = new Conta(numeroConta, nome);
			System.out.println();
			System.out.println(conta.toString());
			
			System.out.println("\nDeseja fazer um depósito? (s/n) ");
			esc = scanner.next().charAt(0);
			
			if(esc == 's') {
				
				System.out.print("Valor de depósito R$: ");
				double deposito = scanner.nextDouble();
				conta.deposito(deposito);
				
				System.out.print("\nDeseja ver os dados da conta atualizados? (s/n) ");
				esc = scanner.next().charAt(0);
				if(esc == 's') {
					System.out.println();
					System.out.println("Dados  da conta atualizados: \n"+conta.toString());
				}else {
					System.out.println("FIM DA OPERAÇÃO");
				}
			}
			
			System.out.print("Deseja sacar alguma quantia? (s/n)");
			esc = scanner.next().charAt(0);
			if(esc == 's') {
				System.out.print("\nDigite o valor que deseja sacar R$: ");
				double saque = scanner.nextDouble();
				conta.saque(saque);
				System.out.println("Saque realizado!");
				
				System.out.println("\nDeseja ver os dados da conta atualizados? (s/n) ");
				esc = scanner.next().charAt(0);
				if(esc == 's') {
					System.out.println();
					System.out.println("Dados  da conta atualizados: \n"+conta.toString());
				}else {
					System.out.println("FIM DA OPERAÇÃO");
				}
			}else {
				System.out.println("FIM DA OPERAÇÃO");
			}
			
		}
		
		
		
		scanner.close();
	}

}
