public class ContaCorrente extends Conta {

    private PessoaFisica pessoaFisica;


    public ContaCorrente(String numeroConta, double saldoConta,PessoaFisica pessoaFisica) {
        super(numeroConta, saldoConta);
        this.pessoaFisica = pessoaFisica;
    }

    public void sacarContaCorrente(ContaCorrente contaCorrente,double valor){

        if(valor<getSaldoConta()){
            setSaldoConta(valor);
        }else{
            System.out.println("Valor incorreto");
        }
    }
}
