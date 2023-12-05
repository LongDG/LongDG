
public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber){
		super(firstName,lastName,socialSecurityNumber);
		this.weeklySalary = 0;
	}
    //Phuong thuc get set de dat va lay weeklySalary 
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	//Tra luong cho SalariedEmployee
	public void earnings(){
		System.out.print("\nLuong cua SalariedEmployee la: "+this.weeklySalary*4);
	}
	
	@Override
	public void printconsts(){
		System.out.print("\nThong tin SalariedEmployee: ");
		System.out.print("\nHo va ten: "+getLastName()+" "+getFirstName());
		System.out.print("\nSo bao hiem xa hoi: "+getSocialSecurityNumber());
	}
	
	
}
