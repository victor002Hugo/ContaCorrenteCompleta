public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica(String nomeCliente, String numeroConta, String endereco, String numeroContato,
                          String cnpj) {
        super(nomeCliente, numeroConta, endereco, numeroContato);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
