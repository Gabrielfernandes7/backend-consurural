package com.consurural.consurural.configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationConfiguration {
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
            case 0:
                return list.get(linha).replaceAll("telefone_principal=", "");
            case 1:
                return list.get(linha).replaceAll("mensagem_principal=", "");
            default:
                return "Not found";
        }
    }
}
