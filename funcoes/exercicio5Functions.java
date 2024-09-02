import java.util.Scanner;

public class exercicio5Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para saber o fatorial: ");
        int numParaFat = scanner.nextInt();

        CalculaFatorial(numParaFat);
        scanner.close();
    }

    public static void CalculaFatorial(int numF) {
        int calcF = 1;
        for(int i = numF; i > 0; i--){
            System.out.print(i + " * ");
            calcF *= i;
        }
        System.out.print(" = " + calcF);
    }
}
