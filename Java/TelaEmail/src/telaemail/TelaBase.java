/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaemail;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Smart It Systems
 */
public class TelaBase extends Frame{
     TelaBase() {
        Dimension d01= new Dimension(640, 480);
        this.setSize(d01);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
}
