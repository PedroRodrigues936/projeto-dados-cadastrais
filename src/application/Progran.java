package application;

import java.util.Locale;
import java.util.Scanner;

import antities.account;

public class Progran {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       Locale.setDefault(Locale.US);
       account account;
       
       System.out.println("Entre com o número da conta: ");
       int number = sc.nextInt();
       System.out.println("Entre com o nome do titular da conta: ");
       sc.nextLine();
       String houder = sc.nextLine();
       System.out.println("gostaria de fazer um deposito inicial (Y/n)? ");
       char response = sc.next().charAt(0);
       if (response == 'y') {
    	   System.out.println("Entre com o deposito inicial: ");
    	   double initialDeposit = sc.nextDouble();
    	   account = new account (number, houder, initialDeposit);
       }else {
    	   account = new account(number, houder);
       }
       System.out.println();
       System.out.println("Dados da conta: ");
       System.out.println(account);
       
       System.out.println();
       System.out.printf("faça um deposito: ");
       double depositValue = sc.nextDouble();
       account.deposit(depositValue);
       System.out.println("atualização da conta: ");
       System.out.println(account);
       
       System.out.println();
       System.out.printf("faça um saque na conta: ");
       double withdrawValue = sc.nextDouble();
       account.withdraw(withdrawValue);
       System.out.println("atualização da conta: ");
       System.out.println(account);
       
       sc.close();
	}

}
