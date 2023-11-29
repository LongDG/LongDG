import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

	ArrayList<Canbo> danhsachCanbo = new ArrayList<Canbo>();

	public void themcanbo(Canbo canbo) {
		danhsachCanbo.add(canbo);
		System.out.println("da them thanh cong.");

	}

	public ArrayList<Canbo> timkiemtheoHoTen(String HoTen) {
		ArrayList<Canbo> ketqua = new ArrayList<Canbo>();
		for (Canbo canbo : danhsachCanbo) {
			if (canbo.HoTen.equals(HoTen)) {
				ketqua.add(canbo);
			}
		}
		return ketqua;
	}

	public void hienthidanhsachCanbo() {
		for (int i = 0; i < danhsachCanbo.size(); i++) {
			Canbo canbo = danhsachCanbo.get(i);
			canbo.hienthithongtin();
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		QLCB qlcb = new QLCB();

		while (true) {
			System.out
					.println("*---------------------------------------------*");
			System.out
					.println("|  1. Them can bo                             |");
			System.out
					.println("|  2. Tim can bo                              |");
			System.out
					.println("|  3. Hien thi danh sach can bo               |");
			System.out
					.println("|  4. Thoat                                   |");
			System.out
					.println("*---------------------------------------------*");

			System.out.println(" chon chuc nang tu 1 - 4: ");
			int chon = ip.nextInt();
			ip.nextLine();

			switch (chon) {
			case 1:
				System.out.println(" nhap Ho ten can bo:  ");
				String Hoten = ip.nextLine();

				System.out.println(" nhap tuoi:  ");
				int tuoi = ip.nextInt();
				ip.nextLine();
				System.out.println("nhap gioi tinh :  ");
				String gioitinh = ip.nextLine();
				ip.nextLine();
				
				System.out.println("nhap dia chi:  ");
				String diachi = ip.nextLine();
				ip.nextLine();
				System.out.println("chon loai can bo: \n1.con nhan\n 2.ky su \n3.nhan vien  ");
				int chon2 = ip.nextInt();
				ip.nextLine();
				
				Canbo newCanbo = null;
					switch (chon2) {
						case 1:
								System.err.println("nhap bat cong nhan: ");
								int bac = ip.nextInt();
								newCanbo = new CongNhan(Hoten, tuoi, gioitinh, diachi, bac);
								break;

						case 2:
								System.err.println("nhap nganh dao tao: ");
								String daotao = ip.nextLine();
								newCanbo = new Kysu(Hoten, tuoi, gioitinh, diachi, daotao);
								break;
						case 3:
								System.err.println("nhap cong viet nhan vien: ");
								String congviec = ip.nextLine();
								newCanbo = new NhanVien(Hoten, tuoi, gioitinh, diachi,congviec);
								break;

						default:
							System.out.println("lua chon khong hop ly.");
							break;

							}
							if (newCanbo != null) {
								qlcb.themcanbo(newCanbo);
							}
							break;
			case 2:

				System.out.println("nhap ten can bo can tim:  ");
				String searchName = ip.nextLine();
				ArrayList<Canbo> Ketquatimkiem = qlcb.timkiemtheoHoTen(searchName);
				if (Ketquatimkiem.isEmpty()) {
					System.out.println("khong tim thay.");
				} else {
					System.out.println("ket qua tim kiem :  ");
					for (Canbo canbo : Ketquatimkiem) {
						canbo.hienthithongtin();
					}
				}
			case 3:
				System.out.println("\n Danh sach can bo:");
				System.out.println("*-------------------------------------------------------------------*");
				qlcb.hienthidanhsachCanbo();
				break;
				
				
				
				
				
				
				
				
				
				
				
			case 4:
				System.out.println("chuong trinh ket thuc ('_')");
				System.exit(chon);
				break;
				default:
					System.out.println("lua chon khong ho le:");
					break;
				
			}
		
		
			
		}
	
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}
	
}