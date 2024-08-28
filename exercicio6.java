import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int[] vetorPar = new int[10];
        int[] vetorImpar = new int[10];

        int contadorPar = 0;
        int contadorImpar = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número inteiro para adicionar ao vetor: ");
            vetor[i] = scanner.nextInt();

            if(vetor[i] % 2 == 0){
                vetorPar[contadorPar++] = vetor[i];
            }else{
                vetorImpar[contadorImpar++] = vetor[i];
            }
        }

        System.out.print("Vetor com todos os números: ");
        for(int i = 0; i < 10; i++){
            System.out.print(vetor[i] + " | ");
        }
        System.out.print("\nVetor com todos os números Pares: ");
        for(int i = 0; i < contadorPar; i++){
            System.out.print(vetorPar[i] + " | ");
        }
        System.out.print("\nVetor com todos os números Ímpares: ");
        for(int i = 0; i < contadorImpar; i++){
            System.out.print(vetorImpar[i] + " | ");
        }

        scanner.close();
    
    }
}
