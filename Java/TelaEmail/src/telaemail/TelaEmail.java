/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaemail;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author Smart It Systems
 */
public class TelaEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaBase t01 = new TelaBase();
        t01.setLayout(null);
        t01.setTitle("Email");
        t01.setSize(300, 160);
        
        Label lblNome = new Label("Nome");
        lblNome.setLocation(20,50);
        lblNome.setSize(50, 20);
        t01.add(lblNome);
        
        Label lblEmail = new Label("Email");
        lblEmail.setLocation(20,80);
        lblEmail.setSize(50, 20);
        t01.add(lblEmail);
        
        TextField txtNome = new TextField();
        txtNome.setLocation(100,50);
        txtNome.setSize(170, 20);
        t01.add(txtNome);
        
        TextField txtEmail = new TextField();
        txtEmail.setLocation(100,80);
        txtEmail.setSize(170, 20);
        t01.add(txtEmail);
        
        Button btnCancel = new Button("Cancelar");
        btnCancel.setLocation(20,120);
        btnCancel.setSize(120, 20);
        t01.add(btnCancel);
        
        Button btnOk = new Button("OK");
        btnOk.setLocation(150,120);
        btnOk.setSize(120, 20);
        t01.add(btnOk);
        
        t01.setVisible(true);
    }
    
}
