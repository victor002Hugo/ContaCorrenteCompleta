public class ContaPoupanca extends Conta {

    private PessoaFisica pessoaFisica;

    public ContaPoupanca(String numeroConta, double saldoConta,PessoaFisica pessoaFisica) {
        super(numeroConta, saldoConta);
        this.pessoaFisica = pessoaFisica;
    }
}

