import java.awt.Graphics;
import javax.swing.*;


class drawLines extends JPanel
{
	static int line1sx, line1sy, line1ex, line1ey, line2sx, line2sy, line2ex, line2ey, line3sx, line3sy, line3ex, line3ey; 


	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.drawLine(line1sx, line1sy, line1ex, line1ey);
		g.drawLine(line2sx, line2sy, line2ex, line2ey);
		g.drawLine(line3sx, line3sy, line3ex, line3ey);
	}

	public static void main(String[] args) 
	{
		drawLines panel = new drawLines();
		JFrame application = new JFrame();


		int line1sx = Integer.parseInt(JOptionPane.showInputDialog("Enter the x starting point for the first line"));
		line1sy = Integer.parseInt(JOptionPane.showInputDialog("Enter the y starting point for the first line"));
		line1ex = Integer.parseInt(JOptionPane.showInputDialog("Enter the x ending point for the first line"));
		line1ey = Integer.parseInt(JOptionPane.showInputDialog("Enter the y ending point for the first line"));
		line2sx = Integer.parseInt(JOptionPane.showInputDialog("Enter the x starting point for the second line"));
		line2sy = Integer.parseInt(JOptionPane.showInputDialog("Enter the y starting point for the second line"));
		line2ex = Integer.parseInt(JOptionPane.showInputDialog("Enter the x ending point for the second line"));
		line2ey = Integer.parseInt(JOptionPane.showInputDialog("Enter the y ending point for the second line"));
		line3sx = Integer.parseInt(JOptionPane.showInputDialog("Enter the x starting point for the third line"));
		line3sy = Integer.parseInt(JOptionPane.showInputDialog("Enter the y starting point for the third line"));
		line3ex = Integer.parseInt(JOptionPane.showInputDialog("Enter the x ending point for the third line"));
		line3ey = Integer.parseInt(JOptionPane.showInputDialog("Enter the y ending point for the third line"));
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.add( panel );
		application.setSize( 500, 500 );
		application.setVisible( true );
		
	}

}
