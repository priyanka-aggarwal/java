import java.awt.*;
import java.awt.event.*;

class myframe extends Frame
{                 
             myframe()
	{
                        this.setTitle("hello world on a frame");
                        mywinhandler wh=new mywinhandler(this);
	     addWindowListener(wh);
                    }
               public void paint(Graphics g)
	{
	     g.drawString("Hello World",20,50);
	}

}
               
class framedemo
{
             public static void main(String [] args)
	{
                         myframe f = new myframe();
	      f.setVisible(true);
                         f.setSize(300, 200);	
	}
}

class mywinhandler extends WindowAdapter
{
                myframe f1;
                public void windowClosing(WindowEvent we) 
	{
                              f1.setVisible(false);
	          System.exit(0);
	}
              mywinhandler(myframe obj)
                  {
                              f1=obj;
                 }
}
