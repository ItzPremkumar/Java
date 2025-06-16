package AWT;
import java.awt.*;
import java.awt.event.*;
public class mouselistner extends Frame implements MouseListener 
{
  Label l1;
  mouselistner()
  {
	  setVisible(true);
	  setSize(500,500);
	  setTitle("Mouselistener demo ex..");
      setLayout(new FlowLayout());
      l1=new Label("Mouse x and y position:");
      add(l1);
      addMouseListener(this);
  }
	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		int x=e.getX();
		int y=e.getY();
		l1.setText("X position="+x+"Y position="+y);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{
		new mouselistner();
	}


}
