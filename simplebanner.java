import java.awt.*;
import java.applet.*;
/*<applet code="simplebanner" width=300 height=300>
</applet>*/
public class simplebanner extends Applet implements Runnable
{
  String msg="                      A simple moving banner                       ";
  Thread t=null;
  boolean stopflag;
  public void init()
   {
      setBackground(Color.cyan);
      setForeground(Color.red);
   
   }

  public void start()
   {
      t=new Thread(this);
      stopflag=false;
      t.start();
   }

  public void run()
  {
     for(;;)
       {
          try{
               repaint();
               Thread.sleep(250);
               if(stopflag)
                 break;
             }
          catch(InterruptedException e)
             {}
        }
   }

  public void stop()
   {
     stopflag=true;
     t=null;
   }

  public void paint(Graphics g)
   {
     char ch;
     ch=msg.charAt(0);
     msg=msg.substring(1,msg.length());
     msg+=ch;
     g.drawString(msg,300,100);
   }
}

          