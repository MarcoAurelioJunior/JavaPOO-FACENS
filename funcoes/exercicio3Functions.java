import java.util.Scanner;

public class exercicio3Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma palavra: ");
        String texto = scanner.next();

        System.out.println("Coloque um caracter para procura-lo: ");
        char caracter = scanner.next().charAt(0);

        int resultado = contCaracter(texto, caracter);

        System.out.println(
            "\n------------------------------------------------\n" +
            "Aviso! se estiver errado considere as letras minúsculas apenas\n" + 
            "------------------------------------------------\n" + 
            "Seu texto tem " + resultado +  caracter + "('s)" + 
            "\n------------------------------------------------\n"

            );
        scanner.close();
    }

    public static int contCaracter(String text, char character){
        int contador = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == character){
                contador++;
            }
        }

        return contador;
    }
}
