public class ContaCorrente extends Conta {

    private PessoaFisica pessoaFisica;


    public ContaCorrente(String numeroConta, double saldoConta,PessoaFisica pessoaFisica) {
        super(numeroConta, saldoConta);
        this.pessoaFisica = pessoaFisica;
    }
}
