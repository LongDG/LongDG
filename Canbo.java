
abstract class Canbo {
	 String HoTen;
	 int tuoi;
	 String gioitinh;
	 String diachi;
	
	public Canbo(String HoTen, int tuoi, String gioitinh, String diachi)
	{
		this.HoTen = HoTen;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.diachi = diachi;	
	}
	
	
	public String getHoTen() {
		return HoTen;
	}


	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}


	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public String getGioitinh() {
		return gioitinh;
	}


	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}


	public String getDiachi() {
		return diachi;
	}


	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}


	public abstract void hienthithongtin();
	
	
}
