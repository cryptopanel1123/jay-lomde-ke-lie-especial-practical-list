//<applet code =p8 height = 500 width=500></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class p8 extends Applet implements ItemListener{
    Checkbox c1,c2,c3;
    int r=255,g=255,b=255;
    Canvas c;
    public  void init(){
        c1=new Checkbox("RED");
        c2=new Checkbox("GREEN");
        c3=new Checkbox("BLUE");
        c=new Canvas();
        c.setSize(30,30);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        add(c1);
        add(c2);
        add(c3);
        add(c);
    }
    public void itemStateChanged(ItemEvent e){
        r=0;g=0;b=0;
        if(c1.getState()){
            r=255;
        } 
        if(c2.getState()){
            g=255;
        }
        if(c3.getState()){
            b=255;
        }
        if(!c1.getState()&& !c2.getState()&& !c3.getState()){
            r=255;g=255;b=255;
        }
        repaint();
    }
    public void paint(Graphics gr){
        c.setBackground(new Color(r,g,b));
    }
}