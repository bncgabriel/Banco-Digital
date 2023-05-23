package entidades;

// Adicionar o "abstract" sempre que não quiser que a class seja instânciada, ou seja, torne-se um objeto.
public abstract class Conta {
    //Atributos
    private int numero;
    private Titular titular;
    private double saldo;
    private String login;
    private String senha;
    private double salario;

    //Método Construtor
    public Conta(int numero, Titular titular, double saldo, double salario) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.login = login;
        this.senha = senha;
        this.salario = salario;
    }

    public String pegarNomeTitula(){
        return this.titular.getNome();
    }

    //Método Personalizado - Comportamento de saque
    public abstract void sacar(double valor);

    //Método Personalizado - Comportamento de depósito
    public abstract void depositar(double valor);

    //Método Personalizado - Comportamento de transferência
    public abstract void transferir(double valor, Conta destinatario);

    //Método Personalizado - Comportamento do extrato
    //public abstract void extrato(double valor);

    //Método Getter - Retorna o número da conta
    public abstract int getNumero();

    //Método Getter - Retonar o saldo da conta
    public double getSaldo(){
        return this.saldo;
    }

    //Método Setter - Altera o saldo da conta
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Método Getter - Retorna o login da conta
    public String getLogin() {
        return login;
    }

    //Método Setter - Altera o login da conta
    public void setLogin(String login) {
        this.login = login;
    }

    //Método Getter - Retorna a senha da conta
    public String getSenha() {
        return senha;
    }

    //Método Setter - Altera a senha da conta
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
