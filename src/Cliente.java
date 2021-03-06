import java.util.ArrayList;

public abstract class Cliente {

    private String nomeCliente;
    private String endereco;
    private String numeroContato;
    private ArrayList<PessoaFisica>pessoasFisicas;
    private ArrayList<PessoaJuridica>pessoasJuridicas;

    public Cliente(String nomeCliente, String endereco, String numeroContato) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.numeroContato = numeroContato;
        this.pessoasFisicas = new ArrayList<PessoaFisica>();
        this.pessoasJuridicas = new ArrayList<PessoaJuridica>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
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



    //Metodo para criar pessoa fisica
    public void criarPessoaFisica(PessoaFisica pessoaFisica){
        this.pessoasFisicas.add(pessoaFisica);
    }

    //Metodo para remover pessoa fisica
    public void removerPessoaFisica(PessoaFisica pessoaFisica){
        this.pessoasFisicas.remove(pessoaFisica);
    }



    //Metodo para criar pessoa juridica
    public void criarPessoaJuridica(PessoaJuridica pessoaJuridica){
        this.pessoasJuridicas.add(pessoaJuridica);
    }

    //Metodo para remover pessoa juridica
    public void removerPessoaJuridica(PessoaJuridica pessoaJuridica){
        this.pessoasJuridicas.remove(pessoaJuridica);
    }

}
