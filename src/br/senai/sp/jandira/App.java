package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Menu;

public class App {
    public static void main(String[] args) {

        System.out.println("-----------  Bem Vindo ------------");
        System.out.println("-    Concessionaria MultiMarcas   -");
        System.out.println("-----------------------------------");

        Menu objMenu = new Menu();
        objMenu.menu();

    }
}
