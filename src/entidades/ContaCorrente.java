package entidades;

import java.sql.SQLOutput;

public class ContaCorrente extends Conta{
    //Atributo
    private double limitePremium;

    //Método Construtor
    public ContaCorrente(int numero, Titular titular, double saldo, double salario) {
        super(numero, titular, saldo, salario);
        this.limitePremium = 100.00;
    }

    // Método Personalizado
    public double verificarSaldo() {
        return this.getSaldo();
    }

    //Método Getter e Setter
    public double getLimitePremium() {
        return limitePremium;
    }

    public void setLimitePremium(double limitePremium) {
        this.limitePremium = limitePremium;
    }

    //Método herdado da class mãe (Conta)
    @Override
    public int getNumero() {
        return this.getNumero();
    }

    //Método herdado da class mãe (Conta)
    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > this.verificarSaldo() + this.getLimitePremium()) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            if (valorSaque <= this.verificarSaldo()) {
                this.setSaldo((this.getSaldo() - valorSaque));
                System.out.println("Dédito: R$ " + valorSaque + "D" + '\n' + "Saldo Atualizado: R$ " + this.getSaldo());
            } else {
                //Verificar quanto está faltando
                double diferenca = this.getSaldo() - valorSaque;

                //Subtrair dos valores
                this.setLimitePremium(this.getLimitePremium() - diferenca);
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Dédito: R$ " + valorSaque + "D" + '\n' + "Valor cheque especial utilizado: R$ " + diferenca + "D");
                System.out.println("Saldo Atualizado: R$ " + this.getSaldo());

            }
        }
    }

    //Método herdado da class mãe (Conta)
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(valor + this.getSaldo());
            System.out.println("Depósito realizado com sucesso!" + '\n' + "Depósito: R$ " + valor + "C");

        } else {
            System.out.println("O valor de depósito é inválido!");
        }
    }

    //Método herdado da class mãe (Conta)
    @Override
    public void transferir(double valorTransferencia, Conta destinatario) {
        if (valorTransferencia > this.verificarSaldo() + this.getLimitePremium()) {
            System.out.println("Saldo insuficiente para transferência!");
        } else {
            if (valorTransferencia <= this.verificarSaldo()) {
                this.setSaldo((this.getSaldo() - valorTransferencia));
                destinatario.setSaldo(destinatario.getSaldo() + valorTransferencia);
                System.out.println("Transferência no valor de R$: " + valorTransferencia + "D" + '\n' + "Realizado para: R$ " + destinatario);
                System.out.println("Saldo Atualizado: R$ " + this.getSaldo());

            } else {
                //Verificar quanto está faltando
                double diferenca = this.getSaldo() - valorTransferencia;

                //Subtrair dos valores
                this.setLimitePremium(this.getLimitePremium() - diferenca);
                this.setSaldo(this.getSaldo() - valorTransferencia);
                destinatario.setSaldo(destinatario.getSaldo() + valorTransferencia);

                System.out.println("Transferência: R$ " + valorTransferencia + "D" + '\n' + "Valor cheque especial utilizado: R$ " + diferenca + "D");
                System.out.println("Saldo Atualizado: R$ " + this.getSaldo());

            }
        }
    }

    //Método herdado da class mãe (Conta)
    //@Override
    //public void extrato(double valor) {
        //System.out.println("Cliente/Titular: " + super.pegarNomeTitula());
        //System.out.println("Número da conta: " + getNumero());
        //System.out.println("Saldo: " + this.verificarSaldo());
        //System.out.println("Limite de Cheque Especial: " + getLimitePremium());
        //********************** VERIFICAR COM O PROFESSOR QUAL O PROBLEMA: ******************************
        //System.out.println("Depositar: " + this.depositar(valor));
        //System.out.println("Transferência: " + this.transferir());
        //System.out.println("Saque: " + this.sacar());
    //}
}
