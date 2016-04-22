import javax.swing.*;
import java.awt.Graphics;

class drawCircles extends JPanel 
{
	
	static int x = 200;
	static int y = 200;
	static int high = 10;//Can't use height or width
	static int wide = 10;//^^^^^^^^^^^^^^^^^^^^^^^^^

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		for (int i = 1;i <= 12;i++)
		{
			g.drawOval(x, y, wide, high);
			x -= 5;
			y -= 5;
			high += 10;
			wide += 10;
		}
	}

	public static void main(String[] args) 
	{
		drawCircles panel = new drawCircles();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.add( panel );
		application.setSize( 500, 500 );
		application.setVisible( true );
	}
}
