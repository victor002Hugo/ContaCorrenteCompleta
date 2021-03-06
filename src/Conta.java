import java.util.ArrayList;

public abstract class Conta {

    private String numeroConta;
    private double saldoConta;
    private boolean contaAtiva;
    private ArrayList<ContaCorrente>contasCorrentes;
    private ArrayList<ContaEmpresarial>contasEmpresariais;
    private ArrayList<ContaEspecial>contasEspeciais;
    private ArrayList<ContaPoupanca>contasPoupancas;


    public Conta(String numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.contaAtiva = true;
        this.contasCorrentes = new ArrayList<ContaCorrente>();
        this.contasEmpresariais = new ArrayList<ContaEmpresarial>();
        this.contasPoupancas = new ArrayList<ContaPoupanca>();
        this.contasEspeciais = new ArrayList<ContaEspecial>();
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

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void desativaConta(){
        this.contaAtiva = false;
    }
    //Metodo para sacar da conta
    public boolean sacar(double valor){
        if(valor <= this.saldoConta){
            this.saldoConta = this.saldoConta-valor;
            System.out.println("Saque realizado com Sucesso ! R$"+valor+"");
            return true;
        }else{
            System.out.println("Saque não realizado, valor insuficiente!");
            return false;
        }
    }


    //Metodo para depositar em uma conta
    public boolean depositar(double valor){
        if (valor>0){
            this.saldoConta += valor;
            System.out.println("Deposito realizado com sucesso!");
            return true;
        }else{
            System.out.println("Deposito não realizado, valor deve ser maior que 0 ");
            return false;
        }
    }

    //Metodo para transferir para uma conta
    public boolean transferir(Conta conta, double valor){
        if(this.sacar(valor)){
            conta.depositar(valor);
            System.out.println("Transferencia realizado com sucesso!");
            return true;
        }else{
            System.out.println("Erro ao realizar a transferência");
            return false;
        }
    }

    //Metodo para rendimento em conta popupanca

    public void redimentoContaPoupanca(ContaPoupanca contaPoupanca){
        double rendimento;
        double saldoConta;
        rendimento = this.saldoConta *0.05;
        this.saldoConta = this.saldoConta + rendimento;
        System.out.println("Seu novo saldo é: "+this.saldoConta);
    }



    //Metodo para criar conta corrente
    public void criarContaCorrente(ContaCorrente contaCorrente){
        this.contasCorrentes.add(contaCorrente);
    }

    //Metodo para remover conta corrente
    public void removerContaCorrente(ContaCorrente contaCorrente){
        this.contasCorrentes.remove(contaCorrente);
    }



    //Metodo para criar conta empresarial
    public void criarContaEmpresarial(ContaEmpresarial contaEmpresarial){
        this.contasEmpresariais.add(contaEmpresarial);
    }

    //Metodo para remover conta empresarial
    public  void removerContaEmpresarial(ContaEmpresarial contaEmpresarial){
        this.contasEmpresariais.remove(contaEmpresarial);
    }



    //Metodo para criar conta especial
    public void criarContaEspecial(ContaEspecial contaEspecial){
        this.contasEspeciais.add(contaEspecial);
    }

    //Metodo para remover conta especial
    public void removerContaEspecial(ContaEspecial contaEspecial){
        this.contasEspeciais.remove(contaEspecial);
    }



    //Metodo para criar conta poupanca
    public void criarContaPoupanca(ContaPoupanca contaPoupanca){
        this.contasPoupancas.add(contaPoupanca);
    }

    //Metodo para remover conta poupanca
    public void removerContaPoupanca(ContaPoupanca contaPoupanca){
        this.contasPoupancas.remove(contaPoupanca);
    }


    public void listarContas(){
        System.out.println(contasCorrentes);
    }


}
