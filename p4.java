import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code=p4 height=100 width=100></applet>
public class p4 extends Applet implements MouseMotionListener{
    int x,y;
    public void init(){
        addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent e){
        x=e.getX();
        y=e.getY();
        showStatus(x+","+y);
        repaint();
    }
    public void mouseDragged(MouseEvent e){
        x=e.getX();
        y=e.getY();
        showStatus(x+","+y);
        repaint();
    }
    public void paint(Graphics g){
        g.fillRect(x,y,10,10);
    }
}