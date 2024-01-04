package br.com.fundatec.locadoraveiculo.tela;
import br.com.fundatec.locadoraveiculo.util.Teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
    //dados

    private Teclado teclado;
    private MenuVeiculo menuVeiculo;
    private MenuCliente menuCliente;
    private MenuLocacoes menuLocacoes;


    //construtor

    public MenuPrincipal() {
        teclado = new Teclado();
        menuVeiculo = new MenuVeiculo(teclado);
        menuCliente = new MenuCliente(teclado);
        menuLocacoes = new MenuLocacoes(teclado);

    }

    //demais
    public void mostrarMenu()
    {
        int opcao;
    do {
            System.out.println("i¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨i");
            System.out.println("|     Menu Principal     |");
            System.out.println("|------------------------|");
            System.out.println("|     1:Menu Veículo     |");
            System.out.println("|     2:Menu Cliente     |");
            System.out.println("|     3:Menu Locação     |");
            System.out.println("|     0:  Encerar  |     |");
            System.out.println("|Informe a Opção desejada|");
            System.out.println("!________________________!");
        opcao= teclado.lerOpcaoUsuario("Informe a opção desejada: ");
        {
            if (opcao==1)
            {
                menuVeiculo.mostrarMenu();
            }
            else if (opcao==2)
            {
                menuCliente.mostrarMenu();
            }
            else if (opcao==3)
            {
                menuLocacoes.mostrarMenu();
            }
            else if (opcao==0)
            {
                System.out.println("Saindo");
            }
            else
            {
                System.out.println("Invalido");
            }
        }
    } while (opcao != 0);

    }
}
