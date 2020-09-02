package lab_01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
