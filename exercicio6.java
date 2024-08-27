import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetorPar = new int[10];
        int[] vetorImpar = new int[10];

        
        for(int i = 0; i <= 10; i++){
            System.out.print("Digite um número inteiro para adicionar ao vetor: ");
            vetor[i] = scanner.nextInt();

            if(vetor[i] % 2 == 0){
                vetorPar[i] = vetor[i];
            }else{
                vetorImpar[i] = vetor[i];
            }
        }

        System.out.println(
            "--------------------------------\n" +
            "Resultados\n" +
            "--------------------------------\n"
        );
        
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorPar[i] + " | ");
            System.out.print(vetorImpar[i] + " | ");
        }

        System.out.println(
            "\n--------------------------------"
        );
    
    }
}
