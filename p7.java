//<applet code =p7 height = 500 width=500></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class p7 extends Applet implements ActionListener{
    Button b;
    Frame f;
    public  void init(){
        f = new Frame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        b=new Button("CLICK");
        b.setBounds(225,225,50,20);
        f.setBackground(Color.RED);
        b.addActionListener(this);
        f.add(b);
    }
    public void actionPerformed(ActionEvent e){
        if(f.getBackground()==Color.RED){
            f.setBackground(Color.GREEN);
        }else if(f.getBackground()==Color.GREEN){
            f.setBackground(Color.BLUE);
        }else{
            f.setBackground(Color.RED);
        }
    }
}