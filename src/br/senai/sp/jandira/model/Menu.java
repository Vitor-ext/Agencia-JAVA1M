package br.senai.sp.jandira.model;

import javax.swing.*;
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();
    Venda objVenda = new Venda();

    Veiculo veiculo = new Veiculo();

    Cliente cliente = new Cliente();


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
            System.out.println("7 - Listar Funcionarios");
            System.out.println("8 - Pesquisar Veiculo");
            System.out.println("9 - Sair do App");
            System.out.println("--------------------------");

            int decisaoUsuario = teclado.nextInt();
            teclado.nextLine();


            switch (decisaoUsuario){

                case 1:
                    Cliente objCliente = new Cliente();
                    objCliente.cadastrarCliente(objCliente);
                    cliente.adicionarCliente(objCliente);
                    break;

                case 2:
                    Veiculo objVeiculo = new Veiculo();
                    objVeiculo.cadastrarVeiculo();
                    veiculo.adicionarVeiculo(objVeiculo);
                    break;

                case 3:
                    Funcionario objFuncionario = new Funcionario();
                    objFuncionario.cadastrarFuncionario();
                    funcionario.adicionarFuncionario(objFuncionario);
                    break;

                case 4:

                    cliente.listClientes();
                    System.out.println("Informe qual cliente deseja comprar um veiculo");
                    String comprador = teclado.nextLine();

                    veiculo.listarVeiculos();
                    System.out.print("Informe qual veiculo:  ");
                    String veiculoSelecionado = teclado.nextLine();

                    funcionario.listFuncionarios();
                    System.out.println("Informe quem é o vendedor: ");
                    String vendedor = teclado.nextLine();

                    Cliente objComprador = cliente.pesquisarComprador(comprador);

                    Veiculo objVeiculoCompra = veiculo.pesquisarVeiculoCompra(veiculoSelecionado);

                    Funcionario objVendedor = funcionario.pesquisarVendedor(vendedor);

                    boolean formaPagamento = objVenda.validarFormaPagamento();

                    boolean vendaDireta = false;
                    boolean vendaFinanciada = false;

                    if (formaPagamento) {
                       vendaDireta = objVenda.realizarVenda(objComprador, objVeiculoCompra);
                    } else {
                       vendaFinanciada = objVenda.financiarVeiculo(objComprador, objVeiculoCompra);
                    }

                    if (vendaDireta || vendaFinanciada){

                        if (vendaDireta){
                            objComprador.dinheiroDisponivel -= objVeiculoCompra.valor;
                        } else {
                            objComprador.dinheiroDisponivel -= objVenda.valorParcela;
                        }


                        System.out.println("Seu saldo é: " + objComprador.dinheiroDisponivel);
                        objVendedor.bonusFuncionario(objVeiculoCompra);
                        System.out.println("O Funcionario recebeu: " + objVendedor.bonus);
                        JOptionPane.showMessageDialog(null, "Valeu Pelo Dinheiro!", "Finalização Venda", JOptionPane.WARNING_MESSAGE);

                    }


                    break;

                case 5:
                    veiculo.listarVeiculos();
                    break;

                case 6:
                    cliente.listClientes();
                    break;

                case 7:
                    funcionario.listFuncionarios();
                    break;
                case 8:
                    System.out.println("Informe Qual o Modelo do Veiculo: ");
                    String veiculoPesquisado = teclado.nextLine();
                    Boolean validaVeiculo = false;

                    if (veiculoPesquisado != null && veiculoPesquisado != "") {
                        validaVeiculo = veiculo.pesquisarVeiculo(veiculoPesquisado);
                    }else {
                        System.out.println("Impossivel Realizar Pesquisa !");
                    }


                    if (validaVeiculo){
                        System.out.println("Veiculo Disponivel Para Compra");
                    } else {
                        System.out.println("Infelizmente Veiculo Indisponivel");
                    }

                    break;

                case 9:
                    continuar = false;
                    break;

            }

            if (decisaoUsuario < 0 || decisaoUsuario > 9 ){
                System.out.println("Digite uma opção válida");
            }

        }

    }

}
