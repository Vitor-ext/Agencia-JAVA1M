package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Funcionario {

    String nome, email, endereco, dataNascimento;
    long telefone, cpf, rg;

    double bonus;

    /** Instancia Teclado */
    Scanner teclado = new Scanner(System.in);

    List<Funcionario> listFuncionarios = new ArrayList<>();


    public void cadastrarFuncionario(){

        System.out.println("----- Cadastro Funcionario ------");
        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe o seu cpf: ");
        cpf = teclado.nextLong();
        System.out.print("Informe o seu rg: ");
        rg = teclado.nextLong();
        teclado.nextLine();
        System.out.print("Informe sua data de Nascimento: ");
        dataNascimento = teclado.nextLine();
        System.out.print("Informe seu email: ");
        email = teclado.nextLine();
        System.out.print("Informe seu endereço: ");
        endereco = teclado.nextLine();
        System.out.print("Informe seu Telefone: ");
        telefone = teclado.nextLong();
        System.out.println("------------------------------");

        System.out.println("Cadastro Finalizado !!");

    }

    public void bonusFuncionario(Veiculo objVeiculo){

        bonus = objVeiculo.valor * 0.10;

    }

    public void adicionarFuncionario(Funcionario objFuncionario){
        listFuncionarios.add(objFuncionario);
    }

    public void listFuncionarios(){
        for (Funcionario objFuncionario : listFuncionarios){
            System.out.println(objFuncionario.nome);
        }
    }

    public Funcionario pesquisarVendedor(String nome){

        for (Funcionario vendedor : listFuncionarios){
            if (vendedor.nome.equalsIgnoreCase(nome)){
                return vendedor;
            }
        }
        return null;
    }


}
