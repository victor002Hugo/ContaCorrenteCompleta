public class ContaEspecial extends Conta {

    private PessoaFisica pessoaFisica;
    private double chequeEspecial;

    public ContaEspecial(String numeroConta, double saldoConta,double chequeEspecial,PessoaFisica pessoaFisica) {
        super(numeroConta, saldoConta);
        this.pessoaFisica = pessoaFisica;
        this.chequeEspecial = chequeEspecial;
    }

    public void sacarContaEspecial(ContaEspecial contaEspecial,double valor){
        double saldoContaParaSacar = getSaldoConta()+this.chequeEspecial;
        if(valor<=saldoContaParaSacar){
            setSaldoConta(getSaldoConta()-valor);
        }else{
            System.out.println("Você não possui saldo suficiente para este saque");
        }
    }
}
