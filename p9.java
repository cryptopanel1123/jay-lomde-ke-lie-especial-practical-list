//<applet code =p9 height = 500 width=500></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class p9 extends Applet implements ActionListener{
    Frame f;
    Panel p;
    TextArea ta;
    MenuBar mb;
    public  void init(){
        setLayout(null);
       f=new Frame("MENUBAR DEMO");
       f.setSize(500,500);
       f.setBackground(Color.gray);
       f.setVisible(true);
    //    add(f);
        mb=new MenuBar();
        p=new Panel();
        f.add(p);
        ta=new TextArea();
        p.add(ta);
        f.setMenuBar(mb);
        Menu m = new Menu("File");
        mb.add(m);
        MenuItem mi=new MenuItem("Save");
        mi.addActionListener(this);
        m.add(mi);
        mi=new MenuItem("SaveAs");
        mi.addActionListener(this);
        m.add(mi);
        m=new Menu("Edit");
        mb.add(m);
        mi=new MenuItem("Cut");
        mi.addActionListener(this);
        m.add(mi);
        mi=new MenuItem("Paste");
        mi.addActionListener(this);
        m.add(mi);
        f.show();
    }
    public void actionPerformed(ActionEvent e){
        ta.setText("Selected: "+e.getActionCommand());
    }
    
}