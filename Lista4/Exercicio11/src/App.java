/*
11. Aperfeiçoe o exercício anterior solicitando para que o usuário informe o tamanho dasmatrizes a serem multiplicadas. Valide se é possível calcular a matriz produto.A multiplicação de matrizes só é possível quando o número de colunas da primeira matrizé igual ao número de linhas da segunda matriz. Se a multiplicação existir, a matriz produtoterá a quantidade de linhas da primeira matriz e a quantidade de colunas da segundamatriz

Após a validação peça para o usuário inserir os valores de cada matriz e então gere amatriz produto
*/

import java.util.*;

public class App {
  public static void main(String[] args) throws Exception {
    int size_lines,size_columns;

Scanner in = new Scanner(System.in);
System.out.println("Digite o tamanho da matriz 1 (separado por espaço):");
size_lines = in.nextInt();
size_columns = in.nextInt();

int [][]a = new int[size_lines][size_columns];

System.out.println("Digite o tamanho da matriz 2 (separado por espaço):");
size_lines = in.nextInt();
size_columns = in.nextInt();

int [][]b = new int[size_lines][size_columns];

if(a[0].length!=b.length){
    System.out.println("Impossível multiplicar as matrizes");
}else{
    int [][]c = new int[a.length][b[0].length];

    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            System.out.println("Digite a"+i+j+":");
            a[i][j]=in.nextInt();
        }
    }

    for(int i=0;i<b.length;i++){
        for(int j=0;j<b[0].length;j++){
            System.out.println("Digite b"+i+j+":");
            b[i][j]=in.nextInt();
        }
    }

    for(int i=0;i<a.length;i++){
        for(int j=0;j<b[0].length;j++){
            for(int k=0;k<a[0].length;k++){
                c[i][j]+=a[i][k]*b[k][j];
                System.out.println("c"+i+j+" a"+i+k+" b"+k+j);
            }
        }
    }

    for(int [] line : c) {
        for(int value:line)
            System.out.print(value + " ");
        System.out.println();
    }
  }
  }
}
