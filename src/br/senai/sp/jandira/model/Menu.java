package br.senai.sp.jandira.model;

import javax.swing.*;
import java.util.Scanner;

public class Menu {


    Scanner teclado = new Scanner(System.in);

    Cliente objCliente = new Cliente();
    Veiculo objVeiculo = new Veiculo();
    Funcionario objFuncionario = new Funcionario();
    Venda objVenda = new Venda();

    public void menu(){

        boolean continuar = true;

        while (continuar){

            System.out.println("-------------------------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Veiculo");
            System.out.println("3 - Cadastrar Funcionario");
            System.out.println("4 - Realizar Venda");
            System.out.println("5 - Listar Veiculos");
            System.out.println("6 - Listar Clientes");
            System.out.println("7 - Pesquisar Veiculo");
            System.out.println("8 - Sair do App");
            System.out.println("--------------------------");

            int decisaoUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (decisaoUsuario){

                case 1:
                    objCliente.cadastrarCliente();
                    objCliente.adicionarCliente(objCliente);
                    break;

                case 2:
                    objVeiculo.cadastrarVeiculo();
                    objVeiculo.adicionarVeiculo(objVeiculo);
                    break;

                case 3:
                    objFuncionario.cadastrarFuncionario();
                    break;

                case 4:
                    boolean venda = objVenda.realizarVenda(objCliente, objVeiculo);

                    if (venda){
                        objCliente.dinheiroDisponivel -= objVeiculo.valor;
                        System.out.println("Seu saldo é: " + objCliente.dinheiroDisponivel);
                    }

                    objFuncionario.bonusFuncionario(objVeiculo);

                    System.out.println("O Funcionario recebeu: " + objFuncionario.bonus);

                    JOptionPane.showMessageDialog(null, "Valeu Pelo Dinheiro!", "Finalização Venda", JOptionPane.WARNING_MESSAGE);

                    break;

                case 5:
                    objVeiculo.listarVeiculos();
                    break;

                case 6:
                    objCliente.listClientes();
                    break;
                case 7:
                    System.out.println("Feature in Development !!!");
                    break;

                case 8:
                    continuar = false;
                    break;

            }

            if (decisaoUsuario < 0 || decisaoUsuario > 8 ){
                System.out.println("Digite uma opção válida");
            }

        }

    }

}
