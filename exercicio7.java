import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoProduto = 1;
        float precoProduto = 0;
        float precoProdutoAumento = 0;

        float somaProdutoNormal = 0;
        float somaProdutoAumento = 0;

        float mediaPNormal = 0;
        float mediaPAumento = 0;

        int cont = 0;
        float aumento = 0.2f;

        while (codigoProduto > 0) {
            
            System.out.print("Digite o código do produto (apenas número): ");
            codigoProduto = scanner.nextInt();

            if(codigoProduto > 0){ 
                System.out.print("Digite o preço do produto: ");
                precoProduto = scanner.nextFloat();

            
                somaProdutoNormal += precoProduto;
                precoProdutoAumento = (precoProduto * aumento) + precoProduto;
                somaProdutoAumento += precoProdutoAumento;
            
                System.out.println(
                    "\n--------Aplicado aumento de 20% ao preço do produto--------\n" +
                    "Código: 0" + codigoProduto + "\n" +
                    "Preço: R$ " + precoProdutoAumento +
                    "\n------------------------------------------------------------\n"
                );

                cont++;
            }
        }

        mediaPNormal = somaProdutoNormal / cont;
        mediaPAumento = somaProdutoAumento / cont;

        System.out.println(
            "Média dos produtos sem aumento: " + mediaPNormal
        );
        System.out.println(
            "Média dos produtos com aumento: " + mediaPAumento
        );





        scanner.close();

    }
}
