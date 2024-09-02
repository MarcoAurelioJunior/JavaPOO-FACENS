import java.util.Scanner;

public class exercicio4Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura (celsius): ");
        int celsius = scanner.nextInt();

        int resultado = conversorTemp(celsius);
        System.out.print("Convertendo de Celsius para Fahrenheit temos uma temperatura de: " + resultado + " °F");
        scanner.close();
    }

    public static int conversorTemp(int temperatura){
        int Fahrenheit = (temperatura * 9/5) + 32;
        return Fahrenheit;
    }
}
