import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] resultados = new int[6];
        int voto = 1;

        while (voto > 0) {
            System.out.print(
                "\n--------------------\n" +
                "Digite\n" +
                 "1- Candidato A\n" +
                 "2- Candidado B\n" + 
                 "3- Candidado C\n" +
                 "4- Candidato D\n" +
                 "5- Voto nulo\n" +
                 "6- Voto em branco\n" + 
                 "0- Finalizar programa" +
                 "\n--------------------\n" +
                 "Resposta: "
            );

            voto = scanner.nextInt();
            
            switch (voto) {
                case 1:
                    resultados[0] += 1;
                    break;
                case 2:
                    resultados[1] += 1;
                    break;
                case 3:
                    resultados[2] += 1;
                    break;
                case 4:
                    resultados[3] += 1;
                    break;
                case 5:
                    resultados[4] += 1;
                    break;
                case 6:
                    resultados[5] += 1;
                    break;
                default:
                    break;
            }

        }

        System.out.println(
            "\n-----------------------------------------------\n"+   
            "Resultados\n" + 
            "Candidato 1 - " + resultados[0] + " votos\n" + 
            "Candidato 2 - " + resultados[1] + " votos\n" + 
            "Candidato 3 - " + resultados[2] + " votos\n" + 
            "Candidato 4 - " + resultados[3] + " votos\n" +
            "Votos nulos - " + resultados[4] + "\n" +
            "Votos em branco - " + resultados[5] + "\n" + 
            "-----------------------------------------------"   

        );

        scanner.close();
    }
    
}
