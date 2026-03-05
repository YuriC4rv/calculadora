/*Versão principal da calculadora, ótima para efetuar estudos e poder treinar a lógica. 
 * 
 */
package calc_main;
import java.util.Scanner;

public class funcoes_calc {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            // Primeiro número
            System.out.println("Digite o primeiro número (ou 'sair'):");
            String input1 = entrada.next();
            if (input1.equalsIgnoreCase("sair")) {
                break;
            }

            double valor1;
            try {
                valor1 = Double.parseDouble(input1);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, digite um número válido.");
                continue; // volta ao início do loop
            }

            // Operador
            System.out.println("Digite o operador (+, -, *, /, ^, r) ou 'sair':");
            String opInput = entrada.next();
            if (opInput.equalsIgnoreCase("sair")) {
                break;
            }

            char operador = opInput.charAt(0);
            double valor2 = 0;

            // Segundo número somente se não for raiz
            if (operador != 'r') {
                System.out.println("Digite o segundo número (ou 'sair'):");
                String input2 = entrada.next();
                if (input2.equalsIgnoreCase("sair")) {
                    break;
                }
                try {
                    valor2 = Double.parseDouble(input2);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida, digite um número válido.");
                    continue;
                }
            }

            double resultado;

            switch (operador) {
                case '+': // Soma
                    resultado = valor1 + valor2;
                    System.out.println("O resultado da soma é: " + resultado);
                    break;
                case '-': //Subtração
                    resultado = valor1 - valor2;
                    System.out.println("O resultado da subtração é: " + resultado);
                    break;
                case '*': // Multiplicação
                    resultado = valor1 * valor2;
                    System.out.println("O resultado da multiplicação é: " + resultado);
                    break;
                case '/': //Divisão
                    if (valor2 == 0) {
                        System.out.println("Divisão por zero não é permitida!");
                    } else {
                        resultado = valor1 / valor2;
                        System.out.println("O resultado da divisão é: " + resultado);
                    }
                    break;
                case '^': //Potência
                    resultado = Math.pow(valor1, valor2);
                    System.out.println("O resultado da potência é: " + resultado);
                    break;
                case 'r': // Raiz quadrada
                    resultado = Math.sqrt(valor1);
                    System.out.println("O resultado da raiz quadrada é: " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido!");
            }

            System.out.println(); // linha em branco para separar iterações
        }

        System.out.println("Calculadora encerrada.");
        entrada.close();
    }
}