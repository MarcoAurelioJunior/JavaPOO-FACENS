import java.util.Scanner;

public class exercicio2Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numDig = scanner.nextInt();


        boolean resultado = calculaPar(numDig);
        if(resultado == true){
            System.out.println("Seu número é PAR");
        }else{
            System.out.println("Seu número é ÍMPAR");
        }

        scanner.close();
    }

    public static boolean calculaPar(int numPar){
        boolean EPar = false;

        if(numPar % 2 == 0){
            EPar = true;
        }

        return EPar;
    }
}
