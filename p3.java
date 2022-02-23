/*<applet code=p3.java width=500 height=500>
</applet>
*/
import java.applet.*;
import java.lang.*;
import java.awt.*;

public class p3 extends Applet{
    Dimension d;
    int r,gr,b;
    int x=0,y=100,l=100,w=0;
    int c=(int)Math.random();
    int min=0,max=100000;
    public void paint(Graphics g){
        d=getSize();
        g.drawRect(x,y,d.width,100);
        try{
        while(w<=d.width){
            d=getSize();
            r=Math.abs(255-c)%256;
            gr=Math.abs(255+c)%256;
            b=Math.abs(255*c)%256;
            g.setColor(new Color(r,gr,b));
            w+=9;
            g.fillRect(x,y,++w,l);
            c=(int)(Math.random()*(max-min+1)+min);
            Thread.sleep(250);
        }
        }catch(Exception e){}
    }
}