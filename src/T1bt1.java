import java.util.Scanner;

public class T1bt1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // tạo đối tượng scanner liên kết với bàn phím 
        System.out.println("Nhap vao can nang cua ban (KG): ");
        double can = input.nextDouble();
        System.out.println("Nhap vao chieu cao cua ban (M): ");
        double cao = input.nextDouble();
        double BMI = can / (cao * cao);
        if (BMI < 18.5) {
            System.out.println(" Chi so BMI o tren cho thay ban bi Gay");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Chi so BMI o tren cho thay ban Binh Thuong");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("Chi so BMI o tren cho thay ban Thua Can");
        } else {
            System.out.println("Chi so BMI o tren cho thay ban Beo Phi");
        }
        input.close();// đóng scanner
    }
}
