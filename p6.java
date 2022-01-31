//<applet code = p6 height=500 width =500></applet>
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class p6 extends Applet implements MouseListener{
    public void init(){
        addMouseListener(this);
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    // public void mouseMoved(MouseEvent e){}
    // public void mouseDragged(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        setBackground(Color.RED);
    }
    public void mouseReleased(MouseEvent e){
        setBackground(Color.GREEN);
    }
}