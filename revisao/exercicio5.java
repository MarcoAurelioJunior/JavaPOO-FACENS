import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        int soma = 0;
        int multiplicacao = 1;

        for(int i = 0; i <= 4; i++){
            System.out.print((i + 1)+ " - Digite um número para adicionar ao vetor: ");
            vetor[i] = scanner.nextInt();

            soma += vetor[i];
            multiplicacao *= vetor[i];  

        }

        System.out.println(
            "\nResultados\n" +
            "--------------------------------------------\n" + 
            "A soma de todos os números digitados é de: " + soma +  
            "\nA multiplicação de todos os números digitados é de: " + multiplicacao +
            "\n--------------------------------------------\n"
            
        );
        System.out.println(
            "--------------------------------------------\n" + 
            "Os elementos do seu vetor ficaram assim: "
            
        );

        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " | ");
        }

        System.out.println("\n--------------------------------------------\n");
        scanner.close();
    }
}
