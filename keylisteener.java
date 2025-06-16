package AWT;
import java.awt.*;
import java.awt.event.*;
public class keylisteener extends Frame implements KeyListener
{
	Label l1;
	keylisteener()
	{
		 setVisible(true);
		  setSize(500,500);
	      setLayout(new FlowLayout());
	      l1=new Label("Key Demo ex:");
	      add(l1);
	      addKeyListener(this);
	}
	public void keyTyped(KeyEvent e)
	{
	 l1.setText("Key is typed:"+e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		 l1.setText("Key is Pressed:"+e.getKeyChar());
		 if(e.getKeyChar()=='p')
			 dispose();
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		 l1.setText("Key is Released:"+e.getKeyChar());
	}
	public static void main(String[] args) 
	{
      new keylisteener();
	}
}
