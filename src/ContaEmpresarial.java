public class ContaEmpresarial extends Conta{
    private PessoaJuridica pessoaJuridica;
    private double chequeEspecial;

    public ContaEmpresarial(String numeroConta, double saldoConta,double chequeEspecial,PessoaJuridica pessoaJuridica) {
        super(numeroConta, saldoConta);
        this.pessoaJuridica = pessoaJuridica;
        this.chequeEspecial = chequeEspecial;
    }

    public void sacarContaEmpresarial(ContaEmpresarial contaEmpresarial,double valor){
        double saldoContaParaSacar = getSaldoConta()+this.chequeEspecial;
        if(valor<=saldoContaParaSacar){
            setSaldoConta(getSaldoConta()-valor);
        }else{
            System.out.println("Você não possui saldo suficiente para este saque");
        }
    }
}