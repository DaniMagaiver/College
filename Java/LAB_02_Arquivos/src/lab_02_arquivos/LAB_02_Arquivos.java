package lab_02_arquivos;

import java.io.*;
import java.util.ArrayList;

public class LAB_02_Arquivos {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ovos");
        nomes.add("Margarina");
        nomes.add("Farinha de trigo");
        nomes.add("Leite");
        nomes.add("Açúcar");
        nomes.add("Fermento");

        try {
            PrintStream out = new PrintStream(new FileOutputStream("listaDeCompras.txt"));
            out.println("Items:");
            for(String obj: nomes){
                out.println(obj);
            }
            out.close();
        } catch (Exception e) {

        }
    }

}
