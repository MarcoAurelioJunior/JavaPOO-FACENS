import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 1000;
        int totalIdade = 0;
        int totalHomens = 0;
        int totalMulheres = 0;
        int totalIdadeHomens = 0;
        double totalAlturaMulheres = 0;
        int pessoas18a35 = 0;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("---------- Habitante " + (i + 1) + " ----------");
            System.out.println("Digite o sexo (0 - feminino, 1 - masculino):");
            int sexo = scanner.nextInt();
            
            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();
            
            System.out.println("Digite a altura (em metros):");
            double altura = scanner.nextDouble();
            System.out.println("---------------------------------");

            // Acumula a idade para a média geral
            totalIdade += idade;

            // Conta as pessoas com idade entre 18 e 35 anos
            if (idade >= 18 && idade <= 35) {
                pessoas18a35++;
            }

            // Processa informações com base no sexo
            if (sexo == 0) { // feminino
                totalMulheres++;
                totalAlturaMulheres += altura;
            } else if (sexo == 1) { // masculino
                totalHomens++;
                totalIdadeHomens += idade;
            }
        }

        // Calcula as médias solicitadas
        double mediaIdadeGrupo = (double) totalIdade / totalPessoas;
        double mediaAlturaMulheres = totalMulheres > 0 ? totalAlturaMulheres / totalMulheres : 0;
        double mediaIdadeHomens = totalHomens > 0 ? (double) totalIdadeHomens / totalHomens : 0;
        double percentual18a35 = ((double) pessoas18a35 / totalPessoas) * 100;

        // Exibe os resultados
        System.out.printf("Média da idade do grupo: %.0f anos\n", mediaIdadeGrupo);
        System.out.printf("Média da altura das mulheres: %.2f metros\n", mediaAlturaMulheres);
        System.out.printf("Média da idade dos homens: %.2f anos\n", mediaIdadeHomens);
        System.out.printf("Percentual de pessoas com idade entre 18 e 35 anos: %.2f%%\n", percentual18a35);

        scanner.close();
    }
}
