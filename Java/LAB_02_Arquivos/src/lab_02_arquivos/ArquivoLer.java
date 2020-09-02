/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02_arquivos;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Smart It Systems
 */
public class ArquivoLer {
     public static void main(String[] args) {
        Scanner scanner = null;
        try{
            scanner = new Scanner(new FileReader("listaDeAfazeres.txt")).useDelimiter("\n");
            while(scanner.hasNext()){
                String nome = scanner.next();
                System.out.println(nome);
            }
        }catch(Exception e){
            System.out.println("Erro");
            e.printStackTrace();
        }finally{
            scanner.close();
        }
    }
    
}
