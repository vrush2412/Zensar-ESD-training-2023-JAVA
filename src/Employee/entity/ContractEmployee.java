package Employee.entity;

public  class ContractEmployee extends Employee {
   
private int noofdaysWorked;
   private int perDayRate;
   
   public ContractEmployee(int noofdaysWorked, int perDayRate) {
		super();
		this.noofdaysWorked = noofdaysWorked;
		this.perDayRate = perDayRate;
	}
   
public int getNoofdaysWorked() {
	return noofdaysWorked;
}
public void setNoofdaysWorked(int noofdaysWorked) {
	this.noofdaysWorked = noofdaysWorked;
}
public int getPerDayRate() {
	return perDayRate;
}
public void setPerDayRate(int perDayRate) {
	this.perDayRate = perDayRate;
}
@Override
public String toString() {
	return super.toString() + "ContractEmployee [noofdaysWoerked=" + noofdaysWorked + ", perDayRate=" + perDayRate  + "]";
}

@Override
public void calculatesalary() {
	// TODO Auto-generated method stub
	
	//For ContractEmployee
		@Override
		public void calculatesalary() {
			this.salary = this.noofdaysWorked+this.perDayRate;
		}
}

}
