
abstract class Employee {
	private String firstName, lastName, socialSecurityNumber;
    //constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
    //cac phuong thuc get set 
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public void printconsts(){
		System.out.print("\nThong tin: ");
		System.out.print("\nHo va ten: "+this.lastName+" "+this.firstName);
		System.out.print("\nSo bao hiem xa hoi: "+this.socialSecurityNumber);
	}
	
	//Phuong thuc truu tuong
	abstract void earnings();
	
}
