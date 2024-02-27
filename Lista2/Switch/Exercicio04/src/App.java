import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		double purchaseValue, finalValue, discount, fees;
		int formOfPayment, installments;

		Scanner in = new Scanner(System.in);

		System.out.println("Insira o valor da compra:");
		purchaseValue = in.nextDouble();

		System.out.println();

		System.out.println("Menu: \n");
		System.out.println("1. Débito");
		System.out.println("2. Pix");
		System.out.println("3. Crédito");

		System.out.println();

		System.out.println("Escolha a forma de pagamento: ");
		formOfPayment = in.nextInt();

		System.out.println();

		switch (formOfPayment) {
			case 1:
				discount = (5.0 / 100) * purchaseValue;
				finalValue = purchaseValue - discount;
				System.out.println("Valor final da compra: R$ " + finalValue);
				break;
			case 2:
				discount = (10.0 / 100) * purchaseValue;
				finalValue = purchaseValue - discount;
				System.out.println("Valor final da compra: R$ " + finalValue);
				break;
			case 3:
				System.out.println("Crédito Selecionado");
				System.out.println("Escolha o número de parcelas:");
				installments = in.nextInt();

				if (installments <= 4) {
					fees = purchaseValue * 0.02 * installments;
					finalValue = purchaseValue + fees;
					System.out.println("Valor final da compra: R$ " + finalValue);
					in.close();
				} else {
					fees = purchaseValue * 0.05 * installments;
					System.out.println("fees" + fees);
					finalValue = purchaseValue + fees;
					System.out.println("Valor final da compra: R$ " + finalValue);
				}
					break;

			default:
				System.out.println("Valor inválido!");
				break;
		}

		in.close();
	}
}
