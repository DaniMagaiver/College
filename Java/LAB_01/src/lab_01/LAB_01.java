package lab_01;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

public class LAB_01 {

    public static void main(String[] args) {
        TelaBase t01 = new TelaBase();
        
        t01.setTitle("Tela cadastro");
        t01.setLayout(null);
        t01.setSize(500,300);
        
        Label lbl01 = new Label("Código");
        lbl01.setSize(50, 20);
        lbl01.setLocation(20,50);
        t01.add(lbl01);
        
        Label lbl02 = new Label("Nome");
        lbl02.setSize(50, 20);
        lbl02.setLocation(20,60);
        t01.add(lbl02);
        
        Label lbl03 = new Label("Fone");
        lbl03.setSize(40, 20);
        lbl03.setLocation(20,90);
        t01.add(lbl03);
        
        Label lbl04 = new Label("Endereço");
        lbl04.setSize(50, 20);
        lbl04.setLocation(20,130);
        t01.add(lbl04);
        
        TextField txNome = new TextField("Nome");
        txNome.setLocation(250, 50);
        txNome.setSize(200,20);
        t01.add(txNome);
        
        TextField txEmail = new TextField("Email");
        txEmail.setLocation(70, 90);
        txEmail.setSize(170,20);
        t01.add(txEmail);
        
        TextField txFone = new TextField("Telefone");
        txFone.setLocation(330, 90);
        txFone.setSize(120,20);
        t01.add(txFone);
        
        TextField txEndereco = new TextField("Endereço");
        txEndereco.setLocation(90, 130);
        txEndereco.setSize(360,20);
        t01.add(txEndereco);
        
        Button btOk = new Button("OK");
        btOk.setLocation(370,250);
        btOk.setSize(70,25);
        t01.add(btOk);
        
        t01.setVisible(true);
    }
    
}
