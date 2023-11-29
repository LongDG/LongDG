
public class Kysu extends Canbo {
	String daotao;
	public Kysu(String HoTen, int tuoi, String gioitinh, String diachi, String daotao) {
		super(HoTen, tuoi, gioitinh, diachi);
		this.daotao = daotao;
		// TODO Auto-generated constructor stub
	}
	
	
	public String getDaotao() {
		return daotao;
	}


	public void setDaotao(String daotao) {
		this.daotao = daotao;
	}


	@Override
	public void hienthithongtin() {
		// TODO Auto-generated method stub
		System.out.println("ky su :"+HoTen+" - " +tuoi+" tuoi"+"-gioi tinh: "+gioitinh+"- diachi :"+diachi+" -Nganh dao tao:"+daotao);
	}
	

}
