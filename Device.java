package kiemtra_qt2;

class Device {
    private String maSP;
    private String ten;
    private Date ngaySX;

    // Getter va setter
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    // Hàm xuất thông tin thiết bị
    public void print_device() {
        System.out.println("ma SP: " + maSP + ", ten: " + ten + ", ngay SX: ");
        ngaySX.printDate();
    }
}
