import java.util.ArrayList;

public class PessoaFisica extends Cliente {

    private String cpf;


    public PessoaFisica(String nomeCliente, String numeroConta, String endereco, String numeroContato,
                        String cpf) {
        super(nomeCliente, numeroConta, endereco, numeroContato);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

//Metodo de validação de cpf
    private boolean validarCpf(String cpf) {
        if (cpf.length() == 11) {
            return true;
        } else {
            return false;
        }
    }



}
