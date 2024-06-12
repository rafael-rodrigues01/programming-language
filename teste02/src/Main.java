import javax.swing.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Receba 2 números e imprima a média

        Scanner in = new Scanner(System.in);

        double value = 0;
        boolean erro = false;


        do {
            try {
                value = 0;
                erro = false;
                System.out.println("Digite um número:");
                value += in.nextDouble();

                System.out.println("Digite outro número:");
                value += in.nextDouble();

                if (value > 100) {
                    throw new Exception("Erro de lógica");
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido! digite novamente", "Mensagem do Systma", 2);
                System.out.println("deu ruim!" + e);
                erro = true;
                in.nextLine();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro", "Mensagem do Systma", 2);
                System.out.println("deu ruim!" + e);
                erro = true;
                in.nextLine();
            }
        } while (erro);


        System.out.println("A média é " + value/2);

  }
}