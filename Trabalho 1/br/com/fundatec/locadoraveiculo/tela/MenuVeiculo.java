package br.com.fundatec.locadoraveiculo.tela;

import br.com.fundatec.locadoraveiculo.util.Teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuVeiculo {
    //dados
    private Teclado teclado;

    //Construção
    public MenuVeiculo(Teclado teclado) {
        this.teclado = teclado;
    }

    //demais
    public void mostrarMenu() {
        int opcao;
        do {
            System.out.println("i¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨i");
            System.out.println("|      Menu Veiculos     |");
            System.out.println("|------------------------|");
            System.out.println("|        1:Cadastrar     |");
            System.out.println("|        2:Listar        |");
            System.out.println("|        0:Voltar        |");
            System.out.println("|Informe a Opção desejada|");
            System.out.println("!________________________!");
            opcao = teclado.lerOpcaoUsuario("Informe a opção desejada: ");
            {
                if (opcao == 1) {

                } else if (opcao == 2) {

                } else {
                    System.out.println("Invalido");
                }
            }
        } while (opcao != 0);

    }
}
