package entities;

public class CalculoSalario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioAtual() {
		return salarioBruto - imposto;
	}
	
	public double aumento(double bonus) {
		double aux = (salarioBruto * bonus) / 100.0;
		return salarioBruto += aux;
	}
	
	public String toString() {
		return nome + ", salário: " + String.format("%.2f", salarioAtual());
	}
}
