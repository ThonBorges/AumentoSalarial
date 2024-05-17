package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CalculoSalario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		CalculoSalario dadosSalario = new CalculoSalario();
		
		System.out.println("Digite o nome do funcionário: ");
		dadosSalario.nome = sc.nextLine();
		
		System.out.println("Digite o salário bruto do funcionário: ");
		dadosSalario.salarioBruto = sc.nextDouble();
		
		System.out.println("Indique o valor do imposto no salário deste funcionário: ");
		dadosSalario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Salário atual: " + dadosSalario);
		
		System.out.println();
		System.out.println("Indique agora, qual a porcentagem em que o salario do " + dadosSalario.nome + " irá aumentar: ");
		double bonus = sc.nextDouble();
		dadosSalario.aumento(bonus);
		
		System.out.println();
		System.out.println("Novo salário: " + dadosSalario);
		
		sc.close();

	}

}
