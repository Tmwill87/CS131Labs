import javax.swing.JOptionPane;
class pennies 
{
	public static void main(String[] args) 
	{
		int pennies = 0;
		for(int i = 1; i <= 366; i++)
		{
			pennies += i;
		}
		JOptionPane.showMessageDialog(null, "You will have "+pennies+" pennies at the end of the year.");
	}
}
