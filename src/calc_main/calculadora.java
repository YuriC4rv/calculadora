package calc_main;

public class calculadora {

	public static Double calcular (double valor1, double valor2, char operador) {
		switch(operador) {
		case '+':
			return valor1 + valor2;
		case '-':
			return valor1 - valor2;
		case '*':
			return valor1 * valor2;
		case '/':
			if(valor2 == 0) return null;
			return valor1 / valor2;
		case '^':
			return Math.pow(valor1, valor2);
		case 'r':
			return Math.sqrt(valor1);
		default:
			return null;
		}

	}

}
