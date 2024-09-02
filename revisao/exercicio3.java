import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int media = 0;
        int soma = 0;
        int codigo = 0;
        int notas = 0;

        while (codigo <= 3) {
            if(codigo == 1){ //Pede a primera nota e adiciona somando à variável
                System.out.println("Digite sua primeira nota: ");
                notas = scanner.nextInt();
                soma += notas;
            }else if(codigo == 2){ //Pede a segunda nota e adiciona somando à variável
                System.out.println("Digite sua segunda nota: ");
                notas = scanner.nextInt();
                soma += notas;
            }else if(codigo == 3){ //Pede a terceira nota e adiciona somando à variável
                System.out.println("Digite sua terceira nota: ");
                notas = scanner.nextInt();
                soma += notas;

                media = soma / 3; //Calcula a média

                System.out.println(
                    "-------------------------------\n" + 
                    "Sua média é: " + media
                );

                System.out.println(
                    "-------------------------------\n" + 
                    "Deseja saber outra média?\n" +
                    "Digite 1- Continuar, 0- Fechar programa" +
                    "\n-------------------------------" 
                );
                notas = scanner.nextInt();
                if(notas == 1){ //Verificia a opção do usuário e reinicia o programa
                    codigo = 0;
                    media = 0;
                    soma = 0;
                }else{ //Fecha o programa
                   break;
                }
            }

            codigo++;

            scanner.close();
        }
    }
}
