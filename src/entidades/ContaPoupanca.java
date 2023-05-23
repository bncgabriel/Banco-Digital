package entidades;

public class ContaPoupanca extends Conta{
    //Atributo
    private double calcularRentabilidade;

    //Método Construtor
    public ContaPoupanca(int numero, Titular titular, double saldo, double salario) {
        super(numero, titular, saldo, salario);
        this.calcularRentabilidade = calcularRentabilidade;
    }

    //Método Personalizado
    public double verificarSaldoPoupanca() {
        return this.getSaldo();
    }

    //Método Getter and Setter
    public double getCalcularRentabilidade() {
        return calcularRentabilidade;
    }

    public void setCalcularRentabilidade(double calcularRentabilidade) {
        this.calcularRentabilidade = calcularRentabilidade;
    }

    //Métodos herdados da classe mãe (Conta)
    @Override
    public int getNumero() {
        return this.getNumero();
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > this.verificarSaldoPoupanca()) {
            System.out.println("Saldo insuficiente para saque!");
        } else if (valorSaque <= this.verificarSaldoPoupanca()) {
                this.setSaldo((this.getSaldo() - valorSaque));
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.setSaldo(valor + this.getSaldo());
        } else {
            System.out.println("O valor de depósito é inválido!");
        }

    }

    @Override
    public void transferir(double valorTransferencia, Conta destinatario) {
        if (valorTransferencia > this.verificarSaldoPoupanca()) {
            System.out.println("Saldo insuficiente para saque!");
        } else if (valorTransferencia <= this.verificarSaldoPoupanca()) {
            this.setSaldo((this.getSaldo() - valorTransferencia));
        }
    }

    //@Override
    //public void extrato(double valor) {
        //System.out.println("Cliente/Titular: " + super.pegarNomeTitula());
        //System.out.println("Número da conta: " + getNumero());
        //System.out.println("Saldo: " + this.verificarSaldoPoupanca());
        //System.out.println("Depositar: " + this.depositar());
        //System.out.println("Transferência: " + this.transferir());
        //System.out.println("Saque: " + this.sacar());

   // }

}
