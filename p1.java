/*<applet code=p1.java width=500 height=300>
</applet>
*/
import java.applet.*;
import java.awt.*;

public class p1 extends Applet{
    public void paint(Graphics g){
        Dimension d = getSize();
        g.drawOval(d.width/2-75,d.height/2-75,150,150);
        g.drawString("TANMAY TRIVEDI",d.width/2-45,d.height/2+5);
    }
}