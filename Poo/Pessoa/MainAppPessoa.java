package Poo.Pessoa;

public class MainAppPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setCpf("111.222.333.44");
        pessoa1.setNome("Marco");
        pessoa1.setIdade(18);
        pessoa1.setSexo("M");

        System.out.println("CPF: " + pessoa1.getCpf());
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Sexo: " + pessoa1.getSexo());
    }

}
