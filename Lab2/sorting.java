import java.util.Arrays;
import javax.swing.*;

class sorting 
{
	public static void main(String[] args) 
	{
		JTextArea outputArea = new JTextArea();
		String output = "Sorted numbers: ";
		int nums[] = new int[5];
		for (int i = 0;i < 5; i++)
		{
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter 5 numbers to sort."));
		}
		Arrays.sort(nums);
		for (int j = 0; j < 5; j++)
		{
			output += "\n"+nums[j]; 
		}
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea, "Sorted Array", JOptionPane.INFORMATION_MESSAGE);
	}
}
