package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {
    /** Declarar as variaveis **/
    String modelo, marca, cor, combustivel;
    int ano;
    double valor;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    List<Veiculo> listVeiculos = new ArrayList<>();

    public void cadastrarVeiculo(){

        System.out.println("----- Cadastro Veiculo ------");
        System.out.print("Informe qual a marca: ");
        marca = teclado.nextLine();
        System.out.print("Informe o modelo: ");
        modelo = teclado.nextLine();
        System.out.print("Informe o ano: ");
        ano = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Informe a cor: ");
        cor = teclado.nextLine();
        System.out.print("Informe o combustivel: ");
        combustivel = teclado.nextLine();
        System.out.print("Informe o valor: ");
        valor = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("------------------------------");

        System.out.println("Cadastro Finalizado !!");

    }


    public void adicionarVeiculo(Veiculo ObjVeiculo){
        listVeiculos.add(ObjVeiculo);
    }



    public void listarVeiculos(){
        for (Veiculo veiculo : listVeiculos){
            System.out.println(veiculo.modelo);
        }
    }

    public boolean pesquisarVeiculo(String modeloVeiculo){

        for (Veiculo veiculo : listVeiculos){
            if (veiculo.modelo.equalsIgnoreCase(modeloVeiculo)){
                return true;
            }
        }
        return false;
    }




}
