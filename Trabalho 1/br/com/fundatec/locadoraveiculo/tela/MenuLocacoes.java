package br.com.fundatec.locadoraveiculo.tela;

import br.com.fundatec.locadoraveiculo.util.Teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuLocacoes {
    //dados
    private Teclado teclado;

    //Construção
    public MenuLocacoes(Teclado teclado) {
        this.teclado = teclado;
    }

    //demais
    public void mostrarMenu() {
        int opcao;
        do {
            System.out.println("i¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨i");
            System.out.println("|     Menu Clientes      |");
            System.out.println("|------------------------|");
            System.out.println("|     2:Menu Clientes    |");
            System.out.println("|     2:Menu Clientes    |");
            System.out.println("|     3:Menu Clientes    |");
            System.out.println("|     0:   Voltar   |    |");
            System.out.println("|Informe a Opção desejada|");
            System.out.println("!________________________!");
            opcao = teclado.lerOpcaoUsuario("Informe a opção desejada: ");
            {
                if (opcao == 1) {

                } else if (opcao == 2) {

                } else if (opcao == 3) {

                } else {
                    System.out.println("Invalido");
                }
            }
        }
            while (opcao != 0) ;
            {


            }
        }
    }
