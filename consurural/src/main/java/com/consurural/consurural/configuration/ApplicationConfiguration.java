package com.consurural.consurural.configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationConfiguration {
    public static String retriveData(int row) {
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

        switch (row) {
            case 0:
                return list.get(row).replaceAll("Telefone_principal=", "");
            case 1:
                return list.get(row).replaceAll("Mensagem_principal=", "");
            default:
                return "Não encontrado";
        }
    }
}
