import java.util.Scanner;

public class exercicio7Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] listaNum = new double[5];

        for(int i = 0; i < listaNum.length; i++){
            System.out.print("Digite um número para adiciona-lo à lista: ");
            listaNum[i] = scanner.nextInt();
        }

        double resultado = calculaMedia(listaNum);
        System.out.printf("A média de todos os números é de: %.1f",resultado);
        scanner.close();
    }

    public static double calculaMedia(double[] lista){
        int soma = 0;
        double media = 0;
        for(int i = 0; i < lista.length; i++){
            soma += lista[i];
        }

        media = soma / lista.length;

        return media;
    }
}
