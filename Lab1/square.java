import javax.swing.JOptionPane;
class square 
{
	public static void main(String[] args) 
	{
		String square = "";
		int size = Integer.parseInt(JOptionPane.showInputDialog("Input the size of the square"));
		for (int i =1;i<=size;i++)//down
		{
			for (int j = 1;j<=size;j++ )//across
			{
				square += "*";
			}
			square += "\n";
		}
		JOptionPane.showMessageDialog(null,square);
	}
}
