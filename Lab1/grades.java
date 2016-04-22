import javax.swing.JOptionPane;

class grades
{
	public static void main(String[] args) 
	{
		double gpaTotal = 0;
		String[] grade = new String[5];
		int[] grades = new int[5];

		
		for(int i = 0; i <=4; i++){
			grade[i] = JOptionPane.showInputDialog("Enter grade "+(i+1)+".");
			grades[i] = Integer.parseInt(grade[i]);
			if(grades[i] >= 90)
				gpaTotal += 4.;
			if(grades[i] < 90 && grades[i] >= 80)
				gpaTotal += 3.;
			if(grades[i] < 80 && grades[i] >= 70)
				gpaTotal += 2.;
			if (grades[i] < 70 && grades[i] >=60)
				gpaTotal += 1.;
			//if grade < 60, gpa value is 0
		}
		double gpa = gpaTotal/5;
		JOptionPane.showMessageDialog(null, "Your GPA is " +gpa);
	}
}
