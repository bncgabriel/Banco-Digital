package entidades;

public class Emprestimo {
    //Atributos
    private Conta conta;
    private double valorEmprestimo;
    private double taxaJuros;
    private int prazo;
    private double valorParcela;
    private boolean contrato;


    //Método Constutor
    public Emprestimo(Conta conta, double valorEmprestimo, double taxaJuros, int prazo, boolean contrato){
        this.conta = conta;
        this.valorEmprestimo = valorEmprestimo;
        this.taxaJuros = taxaJuros;
        this.prazo = prazo;
        this.valorParcela = valorParcela;
        this.contrato = false;
    }

    //Métodos Personalizados
    public void simularEmprestimo() {
       double montante = this.valorEmprestimo * this.taxaJuros;
       double juros = montante - this.valorEmprestimo;
       double Parcela = montante / this.prazo;
        System.out.println("Valor do empréstimo: R$ " + this.valorEmprestimo + '\n' + "Prazo: " + this.prazo + " meses" + '\n' + "Taxa: " + this.taxaJuros + " a.a" + '\n' + "Valor da Parcela: R$ " + Parcela + '\n' + "Juros total: R$ " + juros + '\n' +  "Montante: R$ " + montante);
    }

    public void solicitarEmprestimo() {
        if((!this.contrato) && (this.valorParcela <= conta.getSalario() * 30/100)) {
            System.out.println("Emprétimo solicitado com sucesso!");
        } else {
            System.out.println("Empréstimo negado, ultrapassa o valor de 30% do salário");
        }
    }

    //Métodos Geterres e Seterres
    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public double getvalorParcela() {
        return valorParcela;
    }

    public void setParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public boolean getContrato() {
        return contrato;
    }

    public void setContrato(boolean contrato) {
        this.contrato = contrato;
    }
}
