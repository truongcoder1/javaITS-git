import java.util.Scanner;

public class T2bt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        double so1 = input.nextDouble();
        System.out.println("Nhap vao so thu hai: ");
        double so2 = input.nextDouble();
        System.out.println("Nhap vao phep toan ( + , - , x , / ): ");
        String pheptoan = input.next();
        double ketqua;
        switch (pheptoan) {
            case "+":
                ketqua = so1 + so2;
                System.out.println("Ket Qua : " + ketqua);
                break;
            case "-":
                ketqua = so1 - so2;
                System.out.println("Ket Qua : " + ketqua);
                break;
            case "x":
                ketqua = so1 * so2;
                System.out.println("Ket Qua : " + ketqua);
                break;
            case "/":
                ketqua = so1 / so2;
                System.out.println("Ket Qua : " + ketqua);
                break;
            default:
                System.out.println("Phep toan khong hop le !!!");
                break;
        }
        input.close();
    }
}
