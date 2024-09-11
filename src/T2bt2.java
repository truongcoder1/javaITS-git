import java.util.Scanner;

public class T2bt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen: ");
        int i = input.nextInt();
        if (checki(i)) {
            System.out.println(i + " La so nguyen to");
        } else {
            System.out.println(i + " Khong phai la so nguyen to");
        }
        input.close();
    }

    public static boolean checki(int i) {
        if (i <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
