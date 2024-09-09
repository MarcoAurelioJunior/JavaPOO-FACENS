package Poo.contaBancaria;

public class mainApp {
    public static void main(String[] args) {
        // Criando dois objetos ContaBancaria
        contaBancaria conta1 = new contaBancaria(1000.0);
        contaBancaria conta2 = new contaBancaria(500.0);

        // Testando os métodos na conta1
        System.out.println("Saldo inicial conta1: " + conta1.getSaldo());
        conta1.depositar(200.0);
        conta1.sacar(150.0);

        // Testando os métodos na conta2
        System.out.println("Saldo inicial conta2: " + conta2.getSaldo());
        conta2.depositar(100.0);
        conta2.sacar(50.0);

    }

     
}
