package br.com.fundatec.locadoraveiculo.tela;
import br.com.fundatec.locadoraveiculo.LocadoraVeiculo;
import br.com.fundatec.locadoraveiculo.tela.modelo.Cliente;
import br.com.fundatec.locadoraveiculo.tela.modelo.Endereco;
import br.com.fundatec.locadoraveiculo.tela.modelo.TipoDocumento;
import br.com.fundatec.locadoraveiculo.tela.modelo.TipoPessoa;
import br.com.fundatec.locadoraveiculo.util.Teclado;

import java.util.Scanner;

public class MenuCliente {
    //dados
    private Teclado teclado;
    //construção
    public MenuCliente(Teclado teclado) {this.teclado = teclado;}
    //demais
    public void mostrarMenu()
    {
        int opcao;
        do {
            System.out.println("i¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨i");
            System.out.println("|      Menu Clientes     |");
            System.out.println("|------------------------|");
            System.out.println("|        1:Cadastrar     |");
            System.out.println("|        2:Listar        |");
            System.out.println("|        0:Voltar        |");
            System.out.println("|Informe a Opção desejada|");
            System.out.println("!________________________!");
            opcao= teclado.lerOpcaoUsuario("Informe a opção desejada: ");
            {}
                if (opcao==1)
                {
                this.cadastrarCliente();
                }
                else if (opcao==2)
                {

                }
                else{System.out.println("Invalido");}

        } while (opcao != 0);

    }

    private void cadastrarCliente()
    {
        TipoPessoa tipoPessoa=teclado.lerTipoPessoa("Deseja Cadastrar Pessoa Fisica Ou Juridica");
        if (TipoPessoa.PESSOA_FISICA == tipoPessoa){
            this.cadastrarPessoaFisica();
        }
        else {
            this.cadastrarPessoaJuridica();
        }
    }
    private void cadastrarPessoaFisica(){
        String nome=teclado.lerString("Informe o nome: ");
        TipoDocumento tipoDocumento=teclado.lertTipoDocumento("Informe o Tipo De Documento");
        Long numeroDocumento =teclado.lerLong("Informo o Numero de Documento");
        Endereco endereco=preencherEndereco();
    }
    private Endereco preencherEndereco()
    {
        String logradouro = teclado.lerString("Informe o logradouro");
        Integer numero = teclado.lerInteger("Informe o numero");
        String complemento = teclado.lerString("Informe o Complemento");
        String bairro = teclado.lerString("Informe Bairro");
        String cidade = teclado.lerString("Informe cidade");
        String uf = teclado.lerString("Informe Uf");
        Integer Cep = teclado.lerInteger("informe Cep");
    }
    private void cadastrarPessoaJuridica(){

    }
}
