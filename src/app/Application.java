package app;

import entidades.ContaCorrente;
import entidades.Emprestimo;
import entidades.Titular;

public class Application {
    public static void main(String[] args) {
        //Instância de objetos:
        Titular titular1 = new Titular("Marcella Araújo", "000.302.000-80");

        System.out.println("------------------------------- Conta Corrente -------------------------------");

        ContaCorrente conta1 = new ContaCorrente(1234-5, titular1, 0, 4500);
        conta1.depositar(3000);
        conta1.setLimitePremium(500);
        conta1.sacar(3400);
        conta1.getSaldo();

        System.out.println("--------------------------------- Empréstimo --------------------------------");

        Emprestimo emprestimo1 = new Emprestimo( conta1, 3000,1.5,48, true);
        emprestimo1.simularEmprestimo();
        emprestimo1.solicitarEmprestimo();


    }
}
