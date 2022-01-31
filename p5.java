//<applet code = p5 height=500 width =500></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class p5 extends Applet implements ActionListener{
    Button b;
    public void init(){
        setLayout(new BorderLayout());
        Panel p = new Panel();
        b= new Button("Start");
        p.setLayout(new GridLayout(1,1));
        b.addActionListener(this);

        p.add(b);
        add(p);
        }
    public void actionPerformed(ActionEvent e){
        //e.getActionCommand(); to retrieve lablel of button
        if(b.getLabel()=="Start"){
            b.setLabel("Stop");
        }else{
            b.setLabel("Start");
        }
    }
}