/*
  Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a média
for maior ou igual a 50, exibir “Aprovado”, caso contrário solicitar ao usuário a nota da
prova de recuperação, tirar nova média entre a média anterior e a prova de recuperação,
se a nova média for menor que 50 exibir “Reprovado” caso contrário exibir “Aprovado”
 */

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		double n1, n2, recoveryNote, media;

		Scanner in = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		n1 = in.nextDouble();

		System.out.println("Digite a segunda nota:");
		n2 = in.nextDouble();

		media = (n1 + n2) / 2;

		System.out.println("A média é: " + media);

		if (media >= 50) {
			System.out.println("Aprovado.");
			in.close();
			return;
		}

		System.out.println("Digite a nota da prova de recuperação:");
		recoveryNote = in.nextDouble();

		media = (media + recoveryNote) / 2;

		System.out.println("A nova média é: " + media);

		if (media < 50) {
			System.out.println("Reprovado.");
			in.close();
			return;
		}

		System.out.println("Aprovado.");
		in.close();
	}
}
