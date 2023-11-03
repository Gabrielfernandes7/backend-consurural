package com.consurural.consurural;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println(retriveData(1));

    }

    public static String retriveData(int linha) {
        try {

            ArrayList<String> list = new ArrayList<String>();
            File myObj = new File("application_configuration.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                list.add(myReader.nextLine());
                System.out.println("info detected: " + list);
            }
            myReader.close();
            return list.get(linha);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "ERRO";
    }

}
