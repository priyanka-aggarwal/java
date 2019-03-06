import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="pushbutton" width=300 height=100>
</applet>*/

public class pushbutton extends Applet
{
	String msg="Try this";
	public void init()
	{
		Button b1=new Button("ok");
		
                                      Okhandler h1=new Okhandler();
                                      add(b1);
		b1.addActionListener(h1);
                    }
	    class Okhandler implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent ae)
	    	{
	    		msg="You clicked Ok";
	    		repaint();
	    	}
	    }
	    public void paint(Graphics g)
	    {
	    	g.drawString(msg,30,30);
	    }
                      
}