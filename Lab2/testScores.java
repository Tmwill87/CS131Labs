import javax.swing.*;

class testScores 
{
	public static void main(String[] args) 
	{
		int[][] Students = new int[5][5];
		double average = 0;
		JTextArea outputArea = new JTextArea();
		String output = "Student\tAverage";
		for (int i = 0;i < 5;i++)
		{
			Students[i][0] = Integer.parseInt(JOptionPane.showInputDialog("Enter the student IDs"));
		}
		for (int j = 0;j <5;j++)
		{
			for (int k = 1;k < 5;k++)
			{
				Students[j][k] = Integer.parseInt(JOptionPane.showInputDialog("Enter the grades for student ID no. "+Students[j][0]));
			}
		}

		for (int l = 0;l < 5;l++ )
		{
			for (int m = 1;m < 5;m++)
			{
				average += Students[l][m];
			}
			output += "\n"+Students[l][0]+"\t"+(average/Students.length);
			average = 0;
		}
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea, "Grades", JOptionPane.INFORMATION_MESSAGE);
	}

}

