package Employee.entity;

public abstract class Employee {
  private int emp_id;
  private String emp_name;
  private long mobno;
  private int salary;
  
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public long getMobno() {
	return mobno;
}
public void setMobno(long mobno) {
	this.mobno = mobno;
}
public abstract void calculatesalary();
   
@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ",emp_name=" + emp_name + ", mobno=" + mobno + ", Salary=" + salary + "]";
    }


}
