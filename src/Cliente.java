public abstract class Cliente {

    private String nomeCliente;
    private String numeroConta;
    private String endereco;
    private String numeroContato;

    public Cliente(String nomeCliente, String numeroConta, String endereco, String numeroContato) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.endereco = endereco;
        this.numeroContato = numeroContato;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }

}
