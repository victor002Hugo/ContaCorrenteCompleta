public class ContaEmpresarial extends Conta{
    private PessoaJuridica pessoaJuridica;

    public ContaEmpresarial(String numeroConta, double saldoConta,PessoaJuridica pessoaJuridica) {
        super(numeroConta, saldoConta);
        this.pessoaJuridica = pessoaJuridica;
    }
}
