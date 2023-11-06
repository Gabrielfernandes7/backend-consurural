package com.consurural.consurural.configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationConfiguration {

    //Esta metodo deve ler as linhas de configuração do arquivo: application_configuration.txt

    public static String retriveData(int linha) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            File myObj = new File("application_configuration.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                list.add(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        switch (linha) {
            case 0: // Telefone principal
                return list.get(linha).replaceAll("telefone_principal=", "");
            case 1: // Mensagem principal
                return list.get(linha).replaceAll("mensagem_principal=", "");
            default:
                return "No found";
        }
    }
}
