import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = 1;
        int[] variaveis = new int[3];/*
            [0] - Contador
            [1] - Soma de todos os números
            [2] - Média final
        */

        while (numeroDigitado > 0) {
            System.out.println("Digite um número: ");
            numeroDigitado = scanner.nextInt();

            if(numeroDigitado % 2 == 0 && numeroDigitado > 0){
                variaveis[0]++;
                variaveis[1] += numeroDigitado;
            }
        }

        variaveis[2] = variaveis[1] / variaveis[0];
        System.out.println("A média dos números digitados é: " + variaveis[2]);

        scanner.close();
    }
}
