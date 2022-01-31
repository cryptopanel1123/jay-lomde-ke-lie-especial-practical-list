//<applet code =p10 height = 500 width=500></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class p10 extends Applet implements FocusListener{
    TextField t1,t2;
    public  void init(){
        setLayout(null);
        t1=new TextField();
        t2=new TextField();
        t1.setBounds(100,100,100,20);
        t2.setBounds(100,130,100,20);
        t2.addFocusListener(this);
        add(t1);
        add(t2);
    }
    public void focusLost(FocusEvent e){
            t1.setText("");
            t2.setText("");
    }
    public void focusGained(FocusEvent e){
            StringBuffer s = new StringBuffer(t1.getText());
            s.reverse();
            t2.setText(s.toString());
    }
}