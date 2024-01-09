package kiemtra_qt2;

class Computer extends Device {
    private double gia;
    private String cauHinh;

    // Getter va setter
    public double getGia() {
        return gia;
    }

    public void setGiaBan(double gia) {
        this.gia = gia;
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public void setCauHinh(String cauHinh) {
        this.cauHinh = cauHinh;
    }
    
    
    public double giaban() {
    	return gia * 10/100;
    }
    // ham in thong tin computer
    public void print_computer() {
        print_device();
        System.out.println("Gia ban: " + giaban() + ", Cau hinh: " + cauHinh);
    }
}
