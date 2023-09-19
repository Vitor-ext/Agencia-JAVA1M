package br.senai.sp.jandira.model;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    String nome, email, endereco, dataNascimento;
    long telefone, cpf, rg;

    double dinheiroDisponivel;

    /** Instancia Teclado */
    Scanner teclado = new Scanner(System.in);

    List<Cliente> listClientes = new ArrayList<>();

    public Cliente cadastrarCliente(Cliente cliente){

        System.out.println("----- Cadastro Cliente ------");
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
        System.out.println("Quanto tu tem para gastar");
        dinheiroDisponivel = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("------------------------------");

        System.out.println("Cadastro Finalizado !!");

        return cliente;

    }

    public void adicionarCliente(Cliente objCliente){
        listClientes.add(objCliente);
    }

    public void listClientes(){
        for (Cliente objCliente : listClientes){
            System.out.println(objCliente.nome);
        }
    }



}
