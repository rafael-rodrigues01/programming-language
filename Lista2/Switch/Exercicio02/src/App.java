import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		double number1, number2, result;
		int number3;

		Scanner in = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		number1 = in.nextDouble();

		System.out.println("Digite um número inteiro:");
		number2 = in.nextDouble();

		System.out.println();

		System.out.println("Menu: \n");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");

		System.out.println();

		System.out.println("Escolha uma opção: ");
		number3 = in.nextInt();

		System.out.println();

		switch (number3) {
			case 1:
				result = number1 + number2;
				System.out.println("Resultado: " + number1 + " + " + number2 + " = " + result);
				break;
			case 2:
				result = number1 - number2;
				System.out.println("Resultado: " + number1 + " - " + number2 + " = " + result);
				break;
			case 3:
				result = number1 * number2;
				System.out.println("Resultado: " + number1 + " x " + number2 + " = " + result);
				break;
			case 4:
				result = number1 / number2;
				System.out.println("Resultado: " + number1 + " / " + number2 + " = " + result);
				break;

			default:
				System.out.println("Valor inválido!");
				break;
		}

		in.close();
	}
}
