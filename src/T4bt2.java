import java.util.HashMap;
import java.util.Scanner;

public class T4bt2 {
    private static HashMap<String, String> KhachHang = new HashMap<>();

    public static void main(String[] args) {
        KhachHang.put("KH001", "Nguyen Van A");
        KhachHang.put("KH002", "Truong Van Ban");
        KhachHang.put("KH003", "Le Thi Liem");
        KhachHang.put("KH004", "Dang Quoc Tung");
        KhachHang.put("KH005", "Lo Van Su");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao ma khach can tim: ");
        String ma = input.nextLine();
        timkiemkhach(ma);
        input.close();
    }

    public static void timkiemkhach(String ma) {
        if (KhachHang.containsKey(ma)) {
            System.out.println("Thong tin khach hang: " + KhachHang.get(ma));
        } else
            System.out.println("Khong tim thay thong tin khach hang");
    }
}
