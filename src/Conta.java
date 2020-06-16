public abstract class Conta {

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

    public void consultarSaldo(){
     //  System.out.println("O nome do Titular é: "+this.nomeUsuario);
     //   System.out.println("A conta selecionada é: "+this.nroConta);
     //   System.out.println("O CPF do titular da conta é: "+this.cpf);
     //   System.out.println("Seu saldo é: "+this.saldo);

    }
}
