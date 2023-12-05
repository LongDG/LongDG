
public class HourlyEmployee extends Employee{
	private double wage, hours; //luong tren mot gio 

	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	    this.wage = 0;
	    this.hours = 0;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	//tra luong cho HourlyEmployee
	//Nhan vien lanh luong theo gio, neu so gio tren 40 thi tinh gap 1.5 lan binh thuong 
	public void earnings(){
		double luongduoctra;
		if(this.hours <= 40){
			luongduoctra = this.wage * this.hours;
		}
		else{
			luongduoctra = (this.wage * this.hours)*1.5;
		}
		
		System.out.print("\nLuong cua HourlyEmployee duoc tra la: "+luongduoctra);
	}
	
	@Override
	public void printconsts(){
		System.out.print("\nThong tin HourlyEmployee: ");
		System.out.print("\nHo va ten: "+getLastName()+" "+getFirstName());
		System.out.print("\nSo bao hiem xa hoi: "+getSocialSecurityNumber());
	}
	
}
