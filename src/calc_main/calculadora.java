//Lógica de cálculos
package calc_main;

public class calculadora {

	public static Double calcular (double valor1, double valor2, char operador) {
		switch(operador) {
		case '+': // Soma
			return valor1 + valor2;
		case '-': // Subtração
			return valor1 - valor2;
		case '*': // Multiplicação
			return valor1 * valor2;
		case '/': // Divisão
			if(valor2 == 0) return null;
			return valor1 / valor2;
		case '^': // Potência
			return Math.pow(valor1, valor2);
		case 'r': // Raiz quadrada
			return Math.sqrt(valor1);
		default:
			return null;
		}

	}

}
