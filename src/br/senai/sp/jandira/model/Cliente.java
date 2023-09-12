package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {
    String nome, email, endereco, dataNascimento;
    long telefone, cpf, rg;

    double dinheiroDisponivel;

    /** Instancia Teclado */
    Scanner teclado = new Scanner(System.in);


    public void cadastrarCliente(){

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
        System.out.println("------------------------------");

        System.out.println("Cadastro Finalizado !!");

    }

}
