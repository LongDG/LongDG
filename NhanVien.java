
public class NhanVien extends Canbo{
	String congviet;
	public NhanVien(String HoTen, int tuoi, String gioitinh, String diachi, String congviet) {
		super(HoTen, tuoi, gioitinh, diachi);
		this.congviet = congviet;
	}

	public String getCongviet() {
		return congviet;
	}

	public void setCongviet(String congviet) {
		this.congviet = congviet;
	}

	@Override
	public void hienthithongtin() {
		System.out.println("NhanVien: -"+HoTen+" - " +tuoi+"-tuoi"+"-gioitinh:"+gioitinh+"-diachi:"+diachi+"-cong viet:"+congviet);
	}

}
