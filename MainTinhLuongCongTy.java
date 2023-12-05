import java.util.Scanner;
public class MainTinhLuongCongTy {
	public static void main(String[] args) {
		String ho, ten, sobaohiemxahoi;
		double luongtrentuan;
		Scanner ip = new Scanner(System.in);
		
		//nhap thong tin va tinh luong cho SalariedEmployee
		System.out.print("\n---SalariedEmployee--");
		System.out.print("\nNhap vao ho: ");
		ho = ip.nextLine();
		System.out.print("Nhap vao ten: ");
		ten = ip.nextLine();
		System.out.print("Nhap so bao hiem xa hoi: ");
		sobaohiemxahoi = ip.nextLine();
		System.out.print("Nhap vao luong/ tuan: ");
		SalariedEmployee t = new SalariedEmployee(ten, ho, sobaohiemxahoi);
		luongtrentuan = ip.nextDouble();
		t.setWeeklySalary(luongtrentuan);
		//Xuat ra thong tin va luong cua SalariedEmployee
		System.out.print("\n---SalariedEmployee--");
		t.printconsts();
		t.earnings();
		
		//Nhap thong tin va tinh luong cho HourlyEmployee
		double luongtrenmotgio, sogio;
		System.out.print("\n\n---HourlyEmployee--");
		System.out.print("\nNhap vao ho: ");
		ho = ip.nextLine();
		//ip.nextLine();
		System.out.print("Nhap vao ten: ");
		ten = ip.nextLine();
		System.out.print("Nhap so bao hiem xa hoi: ");
		sobaohiemxahoi = ip.nextLine();
		HourlyEmployee h = new HourlyEmployee(ten, ho, sobaohiemxahoi);
		System.out.print("\nNhap vao luong tren mot gio cua HourlyEmployee: ");
		luongtrenmotgio = ip.nextDouble();
		System.out.print("Nhap vao so gio lam viec cua HourlyEmployee: ");
		sogio = ip.nextDouble();
		h.setWage(luongtrenmotgio);
		h.setHours(sogio);
		//Xuat ra thong tin cua HourlyEmployee
		System.out.print("\n---HourlyEmployee--");
		h.printconsts();
		h.earnings();
	
        //Nhap thong tin va tinh luong cua CommissionEmployee
		double tongdoanhsoban, tilehuehong;
		System.out.print("\n\n---CommissionEmployee--");
		System.out.print("\nNhap vao ho: ");
		ho = ip.nextLine();
		//ip.nextLine();
		System.out.print("Nhap vao ten: ");
		ten = ip.nextLine();
		System.out.print("Nhap so bao hiem xa hoi: ");
		sobaohiemxahoi = ip.nextLine();
		CommissionEmployee c = new CommissionEmployee(ten, ho, sobaohiemxahoi);
		System.out.print("Nhap vao tong doanh so ban hang: ");
		tongdoanhsoban = ip.nextDouble();
		System.out.print("Nhap vao ti le phan tram hue hong: ");
		tilehuehong = ip.nextDouble();
		c.setCommissionRate(tongdoanhsoban);
		c.setGrossSales(tilehuehong);
		//Xuat ra thong tin cua CommissionEmployee
		System.out.print("\n---CommissionEmployee--");
		c.printconsts();
		c.earnings();
		
		//Nhap thong tin va tinh luong cua BasePlus
		double luongcoban;
		System.out.print("\n\n---BasePlusCommissinEmployee--");
		System.out.print("\nNhap vao ho: ");
		ho = ip.nextLine();
		ip.nextLine();
		System.out.print("Nhap vao ten: ");
		ten = ip.nextLine();
		System.out.print("Nhap so bao hiem xa hoi: ");
		sobaohiemxahoi = ip.nextLine();
		BasePlusCommissionEmployee x = new BasePlusCommissionEmployee(ten, ho, sobaohiemxahoi);
		System.out.print("Nhap vao luong co ban: ");
		luongcoban = ip.nextDouble();
		x.setBaseSalary(luongcoban);
		//Xuat ra thong tin va luon cua BasePlusCommissionEmployee
		System.out.print("\n---BasePlusCommissionEmployee--");
		x.printconsts();
		System.out.print("\nLuong cua BasePlusCommissionEmployee la: "+x.eaning());
	}

}
