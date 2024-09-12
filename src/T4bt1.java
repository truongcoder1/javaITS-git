import java.util.Scanner;
import java.util.ArrayList;

public class T4bt1 {
    private static ArrayList<String> Books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("quan ly thu vien:");
            System.out.println("1.Them \n2.Sua \n3.Xoa  \n4.Tim kiem \n5.Hien Thi Danh sach \n6.thoat");
            System.out.println("Lua chon:");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten sach: ");
                    String tensach = input.nextLine();
                    Them(tensach);
                    break;
                case 2:
                    System.out.println("Nhap vi tri can sua: ");
                    int vt = input.nextInt();
                    input.nextLine();
                    Sua(vt);
                    break;
                case 3:
                    System.out.println("Chon vi tri can xoa: ");
                    int vitri = input.nextInt();
                    input.nextLine();
                    Xoa(vitri);
                    break;
                case 4:
                    System.out.println("Nhap vao ten sach can tim: ");
                    String ten = input.nextLine();
                    TimKiem(ten);
                    break;
                case 5:
                    HienThi();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("lua chon khong phu hop");
                    break;
            }

        } while (choice != 6);
        input.close();
    }

    // Them sach
    public static void Them(String Tensach) {
        Books.add(Tensach);
        System.out.println("Da them sach " + Tensach);
    }

    // sua ten sach
    public static void Sua(int index) {
        if (index >= 0 && index < Books.size()) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao ten sach: ");
            String ten = input.nextLine();
            Books.set(index, ten);
            System.out.println("Ten sach duoc cap nhat");
        } else
            System.out.println("Khong tim thay sach");
    }

    // xoa ten sach
    public static void Xoa(int index) {
        if (index >= 0 && index < Books.size()) {
            System.out.println("Da xoa sach " + Books.get(index));
            Books.remove(index);
        }
    }

    // Tim kiem
    public static void TimKiem(String TenSach) {
        if (Books.contains(TenSach)) {
            System.out.println("Tim thay sach");
        } else
            System.out.println("sach khong ton tai trong thu vien");
    }

    // in danh sach sach da luu
    public static void HienThi() {
        if (Books.isEmpty()) {
            System.out.println("thu vien het sach");
        } else {
            System.out.println("Thu vien sach co: ");
            for (int i = 0; i < Books.size(); i++) {
                System.out.println(i + ". " + Books.get(i));
            }
        }
    }
}
