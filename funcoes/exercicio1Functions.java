import java.util.Scanner;

public class exercicio1Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Digite outro número: ");
        int n2 = scanner.nextInt();
        
        System.out.print("Escolha uma operação. 1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão: ");
        int operador = scanner.nextInt();

        int resultado = calcula(n1, n2, operador);
        System.out.println("O resultado da sua conta é: " + resultado);
        
        scanner.close();
    }

    public static int calcula(int n1, int n2, int operador){
        int resultado = 0;
        switch (operador) {
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                resultado = n1 / n2;
                break;
            default:
                break;
        }

        return resultado;
    }

}
