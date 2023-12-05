
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		this.baseSalary = 0;

	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double eaning(){
		return (this.baseSalary + earningx());
	}
	
	@Override
	public void printconsts(){
		System.out.print("\nThong tin BasePlusCommissionEmployee: ");
		System.out.print("\nHo va ten: "+getLastName()+" "+getFirstName());
		System.out.print("\nSo bao hiem xa hoi: "+getSocialSecurityNumber());
	}
	
}
