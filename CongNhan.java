
public class CongNhan extends Canbo {
	int bac;
	public CongNhan(String HoTen, int tuoi, String gioitinh, String diachi, int bat) {
		super(HoTen, tuoi, gioitinh, diachi);
		this.bac = bat;
		
	}
	
	
	public int getBac() {
		return bac;
	}


	public void setBac(int bac) {
		this.bac = bac;
	}


	@Override
	public void hienthithongtin() {
		
		System.out.println("cong nhan: -"+HoTen+" - "+tuoi+"tuoi-"+"-"+gioitinh+"-diachi:"+diachi+"bac"+bac);
	}
	

}
