package calc_main;
import java.util.Scanner;
public class funcoes_calc {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean continuar = true;
		while(continuar) {
			//Primeiro número
			System.out.println("Digite o primeiro número: ");
			double valor1 = entrada.nextDouble();
			
			//Operador:
			System.out.println("Digite o Operador: ");
			char operador = entrada.next().charAt(0);
			
			//Segundo número
			System.out.println("Digite o segundo número: ");
			double valor2 = entrada.nextDouble();
			double resultado;
			
			switch(operador) {
			case '+': //Soma
				resultado = valor1 + valor2;
				System.out.println("O resultado da soma é: " + resultado);
				break;
			case '-': // Subtração
				resultado = valor1 - valor2;
				System.out.println("O resultado da subtração é: " + resultado);
				break;
			case '^': //Potência
				resultado = Math.pow(valor1, valor2);
				System.out.println("O resultado da potência é: " + resultado);
				break;
			case 'r': //Raiz quadrada
				resultado = Math.sqrt(valor1);
				System.out.println("O resultado da raiz quadrada é: " + resultado);
				break;
			case '*': //Multiplicação
				resultado = valor1 * valor2;
				System.out.println("O resultado da multiplicação é: " + resultado);
				break;
			case '/': //Divisão
				if(valor2 == 0) {
					System.out.println("Divisão por zero não é permitido!");
				}else {
					resultado = valor1 / valor2;
					System.out.println("O resultado da divisão é: " + resultado);
				}
				String resposta = entrada.next();
				if(resposta.equalsIgnoreCase("sair")) {
					continuar = false;
				}
			}
		}
	}
}
