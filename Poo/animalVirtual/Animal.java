import java.util.Scanner;

public class Animal {
    private String nome;
    private String cor;
    private int idade;
    private int energia = 100;
    private int felicidade = 100;

    Scanner scanner = new Scanner(System.in);

    public void cadastroAnimal(){
        System.out.print("Digite o nome do seu animal: ");
        nome = scanner.next();

        System.out.print("Digite a cor do seu animal: ");
        cor = scanner.next();

        System.out.print("Digite a idade do seu animal: ");
        idade = scanner.nextInt();
    }

    public void alimentar(){
        System.out.println(nome + " foi alimentado e recuperou 10 de energia");
        energia += 10;
    }

    public void brincar(){
        System.out.println(nome + " está brincando... sua felicidade aumentou em 10 e sua energia diminuiu em 5");
        felicidade += 10;
        energia -= 5;
    }   

    public void dormir(){
        System.out.println(nome + " está dormindo... sua energia foi totalmente recuperada");
        energia += 100;
    }

    public void mostraStatus(){
        System.out.println("----- Status -----");
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);
        System.out.println("Felicidade: " + felicidade);
        System.out.println("------------------");
    }

    public String getNome(){
        return nome;
    }
}
