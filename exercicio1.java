import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado = 1;
        int soma = 0;
        int cont = 0;
        int media = 0;

        while (numeroDigitado > 0) {
            System.out.print("----------------------\nPara cancelar digite '0'\nEscreva um número inteiro e positivo: ");
            numeroDigitado = scanner.nextInt();
            if (numeroDigitado > 0) {
                soma += numeroDigitado;
                cont += 1;
            }
        }

        media = soma / cont;
        System.out.println("A média de todos os seus valores é de: " + media);

        scanner.close();
    }
}