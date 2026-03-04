package calc_main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		while(true) {
			System.out.println("Digite o primeiro número(ou 'sair'): ");
			String input1 = entrada.next();
			if(input1.equalsIgnoreCase("sair")) {
				break;
			}
			double valor1;
			try {
				valor1 = Double.parseDouble(input1);
			}catch(NumberFormatException e) {
				System.out.println("Entrada inválida.");
				continue;
			}
			System.out.println("Digite o operador(+, -, *, /, ^, r): ");
			String opInput = entrada.next();
			char operador = opInput.charAt(0);
			double valor2 = 0;
			if(operador != 'r') {
				System.out.println("Digite o segundo número: ");
				String input2 = entrada.next();
				try {
					valor2 = Double.parseDouble(input2);
				}catch(NumberFormatException e) {
					System.out.println("Entrada inválida.");
					continue;
				}
			}
			Double resultado = calculadora.calcular(valor1, valor2, operador);
			if(resultado == null) {
				System.out.println("Operação inválida");
			}else {
				System.out.println("\n\nResultado " + resultado);
			}
			System.out.println();
		}
		entrada.close();
		System.out.println("Calculadora encerrada.");
	}

}
