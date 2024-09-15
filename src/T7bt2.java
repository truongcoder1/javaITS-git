public class T7bt2 {
    public static void main(String[] args) {
        Circle hinhTron = new Circle(5);
        Rectangle HCN = new Rectangle(4, 5);
        System.out.println("Hinh Tron : ");
        hinhTron.hienthi();
        System.out.println();
        System.out.println("Hinh Chu Nhat: ");
        HCN.hienthi();
    }
}

abstract class Shape {
    public abstract double tinhDienTich();

    public void hienthi() {
        System.out.println("Dien Tich: " + tinhDienTich());
    }
}

class Circle extends Shape {
    private double banKinh;

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}

class Rectangle extends Shape {
    private double dai;
    private double rong;

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double tinhDienTich() {
        return dai * rong;
    }
}