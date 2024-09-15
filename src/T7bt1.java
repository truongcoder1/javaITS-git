public class T7bt1 {
    public static void main(String[] args) {
        EmployeeParttime nhanvien1 = new EmployeeParttime("Dang Quoc Tuan", 0001, 60, 5000.0);
        EmployeeFulltime nhanvien2 = new EmployeeFulltime("Truong Quoc Tung", 0002, 500000, 2000.0);
        System.out.println("Thong tin nhan vien ban thoi gian :");
        nhanvien1.ThongTinNV();
        System.out.println();
        System.out.println("Thong tin nhan vien toan thoi gian: ");
        nhanvien2.ThongTinNV();
    }
}

class Employee {
    protected String ten;
    protected int ID;

    public Employee(String ten, int ID) {
        this.ten = ten;
        this.ID = ID;
    }

    public double luong() {
        return 0.0;
    }

    public void ThongTinNV() {
        System.out.println("ID nhan vien: " + ID);
        System.out.println("Ten Nhan Vien: " + ten);
        System.out.println("Luong cua nhan vien: " + luong());
    }
}

class EmployeeParttime extends Employee {
    private int GioLam;
    private double LuongTheoGio;

    public EmployeeParttime(String Ten, int ID, int GioLam, Double LuongTheoGio) {
        super(Ten, ID);
        this.GioLam = GioLam;
        this.LuongTheoGio = LuongTheoGio;
    }

    public double luong() {
        return GioLam * LuongTheoGio;
    }
}

class EmployeeFulltime extends Employee {
    private double LuongCung;
    private double Thuong;

    public EmployeeFulltime(String Ten, int ID, double LuongCung, double Thuong) {
        super(Ten, ID);
        this.LuongCung = LuongCung;
        this.Thuong = Thuong;
    }

    public double luong() {
        return LuongCung + Thuong;
    }
}