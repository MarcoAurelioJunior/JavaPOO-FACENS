import java.util.Scanner;

public class MainAppAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int animalOption = 0;
        int acao = 1;

        Animal ani1 = new Animal();
        Animal ani2 = new Animal();

        System.out.println("Cadastro do PRIMEIRO animal");
        ani1.cadastroAnimal();

        System.out.println();

        System.out.println("Cadastro do SEGUNDO animal");
        ani2.cadastroAnimal();

        ani1.mostraStatus();
        ani2.mostraStatus();

        while (acao > 0) {
            System.out.println(
                "Escolha o animal: \n" +
                "1 - " + ani1.getNome() + "\n" +
                "2 - " + ani2.getNome()
            );
            animalOption = scanner.nextInt();

            System.out.println(
                "Qual a ação: \n" +
                "0 - Fechar o programa \n" +
                "1 - Alimentar \n" + 
                "2 - Brincar \n" + 
                "3 - Dormir "
            );
            acao = scanner.nextInt();

            if(animalOption == 1){
                switch (acao) {
                    case 1:
                        ani1.alimentar();
                        break;
                    
                    case 2:
                        ani1.brincar();
                        break;

                    case 3:
                        ani1.dormir();
                        break;

                    default:
                        break;
                }
                ani1.mostraStatus();
            }else{
                switch (acao) {
                    case 1:
                        ani2.alimentar();
                        break;
                    
                    case 2:
                        ani2.brincar();
                        break;

                    case 3:
                        ani2.dormir();
                        break;
                        
                    default:
                        break;
                }

                ani2.mostraStatus();
            }

        }

        scanner.close();
    }
}
