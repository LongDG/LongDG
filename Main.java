package kiemtra_qt2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("nhap so luong may tinh :");
        int n = scanner.nextInt();

        // tao danh dach mt
        ArrayList<Computer> computers = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            // nhap tjong tin ngay
            System.out.println("nhap thong tin ngay thang nam cho may thu " + (i + 1) + ": ");
            System.out.println("nhap ngay:  ");
            int day = scanner.nextInt();
            System.out.println("nhap thang:  ");
            int month = scanner.nextInt();
            System.out.println("nhap nam:  ");
            int year = scanner.nextInt();
    
            // Tạo đối tượng MyDate
            Date myDate = new Date(day, month, year);
    
            // nhap tihong tin may tinh
            Computer computer = new Computer();
            System.out.println("Nhap ma SP:");
            computer.setMaSP(scanner.next());
            System.out.println("Nhap ten:");
            computer.setTen(scanner.next());
            System.out.println("Nhap gia ban:");
            computer.setGiaBan(scanner.nextDouble());
            System.out.println("Nhap cau hinh:");
            computer.setCauHinh(scanner.next());
            computer.setNgaySX(myDate);
    
            // Them máy tính vào danh sách
            computers.add(computer);
        }
    
        // Xuất thông tin cho từng máy tính
        for (int i = 0; i < n; i++) {
            System.out.println("thong tin computer thu " + (i + 1) + ":");
            computers.get(i).print_computer();
        }
    
        scanner.close();
    }
}
