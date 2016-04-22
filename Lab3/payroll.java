class  payroll
{
	String name, name2, name3;
	int hours, hours2, hours3;
	double wage, wage2, wage3;
	public payroll()
	{

	}

	public void setEmp1(String temp, int temp2, double temp3){
		name = temp;
		hours = temp2;
		wage = temp3;
	}

	public void setEmp2(String temp, int temp2, double temp3){
		name2 = temp;
		hours2 = temp2;
		wage2 = temp3;
	}

	public void setEmp3(String temp, int temp2, double temp3){
		name3 = temp;
		hours3 = temp2;
		wage3 = temp3;
	}



	public String getPay()
	{
		int otHours, otHours2, otHours3;
		double pay, pay2, pay3;
		if (hours > 40)
		{
			otHours = hours - 40;
		}
		pay = wage * hours;

		if (hours2 > 40)
		{
			otHours2 = hours2 - 40;
		}
		pay2 = wage2 * hours2;

		if (hours3 > 40)
		{
			otHours3 = hours3 - 40;
		}
		pay3 = wage3 * hours3;


		String output = "Name\tHours\tWage\tGross Pay\n";
		output += name + "\t" + hours + "\t" + wage + "\t" + pay + "\n";
		output += name2 + "\t" + hours2 + "\t" + wage2 +  "\t" + pay2 + "\n";
		output += name3 + "\t" + hours3 + "\t" + wage3 +  "\t" + pay3 + "\n";
		return output;
	}
}
