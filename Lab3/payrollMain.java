import javax.swing.*;

class payrollMain 
{
	public static void main(String[] args) 
	{
		payroll Employees = new payroll();
		Employees.setEmp1(JOptionPane.showInputDialog("Enter employee name"), Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked")), Double.parseDouble(JOptionPane.showInputDialog("Enter hourly wage")));
		Employees.setEmp2(JOptionPane.showInputDialog("Enter employee name"), Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked")), Double.parseDouble(JOptionPane.showInputDialog("Enter hourly wage")));
		Employees.setEmp3(JOptionPane.showInputDialog("Enter employee name"), Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked")), Double.parseDouble(JOptionPane.showInputDialog("Enter hourly wage")));
		String out = Employees.getPay();
		JTextArea outputArea = new JTextArea();
		outputArea.setText(out);
		JOptionPane.showMessageDialog(null, outputArea, "Pay", JOptionPane.INFORMATION_MESSAGE);
	}
}
