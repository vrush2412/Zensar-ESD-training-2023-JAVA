package Employee.entity;

public class PermanentEmployee extends Employee{
    private int basic;
    private int da;
    private int hra;
    private int pf;
	private int salary;
	
	public PermanentEmployee(int basic, int da, int hra, int pf) {
		super();
		this.basic = basic;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	@Override
	public String toString() {
		return super.toString() + "PermanentEmployee [basic=" + basic + ", da=" + da + ", hra=" + hra+ ", pf=" + pf + "]";
	}
	//public abstract void calculatesalary();
	//for permanentemployee
		@Override
			public void calculatesalary() {
				this.salary = this.basic + this.da + this.hra - this.pf;
			}
}
