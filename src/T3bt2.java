import java.util.Scanner;

public class T3bt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String S = input.nextLine().toLowerCase();
        System.out.println("Nhap vao ky tu can dem: ");
        char ch = input.next().toLowerCase().charAt(0);
        int k = DemKyTu(S, ch);
        System.out.println("so luong ly tu trong chuoi la : " + k);
        input.close();
    }

    public static int DemKyTu(String S, char ch) {
        int dem = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ch) {
                dem++;
            }
        }
        return dem;
    }
}
