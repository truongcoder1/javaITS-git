import java.util.Scanner;
public class T6bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BanksAccount bank = new BanksAccount("0123456789", 50000);
        int choice;
        do {
            System.out.println("Lua chon chuc nang: ");
            System.out.println("1.Thong tin tai khoan \n2.Nap tien \n3.Rut tien \n0.Thoat");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thong tin tai khoan la: ");
                    bank.thongtin();
                    break;
                case 2:
                    System.out.println("Nhap so tien muon nap: ");
                    double tiennap = input.nextDouble();
                    bank.deposit(tiennap);
                    break;
                case 3: 
                    System.out.println("Nhap so tien muon rut: ");
                    double tienrut= input.nextDouble();
                    bank.withdraw(tienrut);
                    break;
                case 0 :
                    System.out.println("Cam on da su dung!");
                    break;
                default:
                    System.out.println("lua chon khong hop le");
                    break;
            }
        } while (choice != 0);
        input.close();
    }
}
