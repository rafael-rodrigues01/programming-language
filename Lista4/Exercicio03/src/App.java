/*
3. Crie um programa que contenha um vetor de inteiros de 10 posições (inicializar o vetorjunto com sua declaração). O programa deve solicitar ao usuário um número inteiro(armazenar em uma variável comum inteira) e então realizar uma busca dentro do vetor.Caso a variável digitada exista dentro do vetor, exibir sua posição no vetor caso contrárioexibir a mensagem “Valor não encontrado”
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int n;
        boolean verification = false;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        n = in.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                System.out.println("O número digitado é existente no vetor, posição do número no vetor:" + i);
                verification = true;
                break;
            }
        }
        if (!verification) {
            System.out.println("Valor não encontrado.");
        }
    }
}