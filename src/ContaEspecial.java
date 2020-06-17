public class ContaEspecial extends Conta {

    private PessoaFisica pessoaFisica;

    public ContaEspecial(String numeroConta, double saldoConta,PessoaFisica pessoaFisica) {
        super(numeroConta, saldoConta);
        this.pessoaFisica = pessoaFisica;
    }
}
