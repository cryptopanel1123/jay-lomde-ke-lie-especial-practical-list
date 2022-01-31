/*<applet code=prac2.java width=500 height=500>
</applet>
*/
import java.applet.*;
import java.awt.*;

public class p2 extends Applet{
    public void paint(Graphics g){
        int y=0;
        g.setColor(Color.RED);
        for(int i=0;i<10;i++){
            g.fillOval(250,y,50,50);
            y+=50;
        }
    }
}