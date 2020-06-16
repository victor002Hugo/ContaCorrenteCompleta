public class Conta {

    private String numeroConta;
    private double saldoConta;
    private boolean contaAtiva;


    public Conta(String numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.contaAtiva = true;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void desativaConta(){
        this.contaAtiva = false;
    }
}
