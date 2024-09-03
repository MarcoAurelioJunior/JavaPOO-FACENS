import java.util.Scanner;

public class exercicio6Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numPrimo = scanner.nextInt();

        boolean resultado = calculaMedia(numPrimo);
        System.out.println(resultado);
        scanner.close();
    }

    public static boolean calculaMedia(int nP){
        int cont = 0;
        for(int i = 1; i <= nP; i++){
            if (nP % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            return true;
        }else{
            return false;
        }

    }
}
