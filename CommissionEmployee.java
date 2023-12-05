import java.util.Scanner;
public class CommissionEmployee extends Employee{
	private double grossSales, commissionRate; // tong doanh so ban va ti le hue hong

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		this.commissionRate = 0;
		this.grossSales = 0;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
    
	public void earnings(){
		System.out.print("\nLuong cua Commission la: "+(this.commissionRate*(this.grossSales/100)));
	}
	
	public double earningx(){
		return this.commissionRate*(this.grossSales/100);
	}
	 
	@Override
	public void printconsts(){
		System.out.print("\nThong tin CommissionEmployee: ");
		System.out.print("\nHo va ten: "+getLastName()+" "+getFirstName());
		System.out.print("\nSo bao hiem xa hoi: "+getSocialSecurityNumber());
	}
	
}
