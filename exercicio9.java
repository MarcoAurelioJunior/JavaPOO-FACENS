import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdPessoas = 7;

        int idade = 0;
        int peso = 0;

        int soma = 0;
        int contIdade = 0;

        int qtdPessoasMais90 = 0;
        int media = 0;

        for(int i = 0; i < qtdPessoas; i++){
            System.out.println("--------- Pessoa " + (i + 1) + " ---------");
            System.out.println("Digite a sua idade: ");
            idade = scanner.nextInt();

            System.out.println("Digite o seu peso: ");
            peso = scanner.nextInt();
            System.out.println("----------------------------");

            if(peso >= 90){
                contIdade++;
            }

            soma += idade;
        }

        media = soma / qtdPessoas;
        qtdPessoasMais90 = contIdade;

        System.out.println("Média das idades: " + media);
        System.out.println("Quantidade de pessoas com mais de 90 quilos: " + qtdPessoasMais90);

    }
}
