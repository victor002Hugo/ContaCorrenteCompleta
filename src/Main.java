import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PessoaFisica pessoa1 = new PessoaFisica("victor","5245","","");
        ContaCorrente conta2 = new ContaCorrente("0000",0.1,pessoa1);
        PessoaJuridica pessoaJuridica = new PessoaJuridica("jose","","","55555555");


        ContaEmpresarial contaEmpresarial = new ContaEmpresarial("000",0.0,pessoaJuridica);

        pessoa1.buscarPessoaFisica("victor");

    }
}
