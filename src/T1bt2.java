import java.util.Scanner;

public class T1bt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao nhiet do (C/F): ");
        double nhietdo = input.nextDouble();
        System.out.println("Lua chon chuyen doi: \n1.C->F \n2.F->C");
        int so = input.nextInt();
        if (so == 1) {
            nhietdo = nhietdo * (9 / 5) + 32;
            System.out.printf("Nhiet do tinh theo do F la: %.1f F", nhietdo);
        } else {
            nhietdo = (nhietdo - 32) * (5 / 9);
            System.out.printf("Nhiet do tinh theo do C la: %.1f C", nhietdo);
        }
        input.close();
    }
}
