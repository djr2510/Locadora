package br.com.fundatec.locadoraveiculo.util;


import br.com.fundatec.locadoraveiculo.tela.modelo.Endereco;
import br.com.fundatec.locadoraveiculo.tela.modelo.TipoDocumento;
import br.com.fundatec.locadoraveiculo.tela.modelo.TipoPessoa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
    private Scanner scanner;

    public Teclado(){
        this.scanner =new Scanner(System.in);
    }

    public int lerOpcaoUsuario(String mensagem)
    {
        int opcao;
        try {
            opcao= scanner.nextInt();
        } catch (InputMismatchException excecao){
            opcao=-1;
        }
        scanner.nextLine();
        return opcao;
    }

    public TipoPessoa lerTipoPessoa(String mensagem){
        String tipoPessoa=null;
        do {
            System.out.println(mensagem);
            try {
                tipoPessoa = scanner.nextLine();
                return TipoPessoa.valueOf(tipoPessoa.toUpperCase());
            } catch (IllegalArgumentException excecao) {
                System.out.println("Invalida");
            }
        } while (true);
    }
    public String lerString(String mensagem){
        System.out.println(mensagem);
        return scanner.nextLine();
    }
    public Long lerLong(String mensagem){
        do {
            System.out.println(mensagem);
            try {
                Long numero = scanner.nextLong();
                scanner.nextLine();
                return numero;
            } catch (IllegalArgumentException excecao) {
                System.out.println("Numero Invalido");
            }
        } while (true);
    }
    public TipoDocumento lertTipoDocumento(String mensagem){
        do {
        System.out.println(mensagem);
        try {
            String tipoDocumento = scanner.nextLine();
            return TipoDocumento.valueOf(tipoDocumento.toUpperCase());
        } catch (IllegalArgumentException excecao) {
            System.out.println("Invalida");
        }
        } while (true);
    }
    private void cadastrarPessoaJuridica()
    {

    }

    public Integer lerInteger(String mensagem){
        do {
            System.out.println(mensagem);
            try {
                Integer numero = scanner.nextInt();
                scanner.nextLine();
                return numero;
            } catch (IllegalArgumentException excecao) {
                System.out.println("Numero Invalido");
            }
        } while (true);
    }

}
