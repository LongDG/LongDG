package kiemtra_qt2;

import java.time.LocalDate;

class Date {
    private int day;
    private int month;
    private int year;

    // Hàm khởi tạo
    public Date(int day, int month, int year) {
        if (check_date(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            LocalDate currentDate = LocalDate.now();
            this.day = currentDate.getDayOfMonth();
            this.month = currentDate.getMonthValue();
            this.year = currentDate.getYear();
        }
    }

    // kiem tra ngay thang nam hop le
    private boolean check_date(int day, int month, int year) {
        if (month < 1 || month > 12 || year < 0) {
            return false;
        }

        int maxDay = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDay = 29;
            } else {
                maxDay = 28;
            }
        }

        return (day >= 1 && day <= maxDay);
    }

    // Getter và setter
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //ham xuat thong tin ngay
    public void printDate() {
        System.out.println("ngay: " + day + ", Thang: " + month + ", Nam: " + year);
    }
}
