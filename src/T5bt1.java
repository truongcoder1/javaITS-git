import java.io.FileWriter;
import java.util.Scanner;
public class T5bt1 {
    public static void ghidulieu(String tenTG , String TenS , String nam ){
        try {
            FileWriter writer = new FileWriter("file.txt",true);
            writer.write("Ten Sach: " + TenS + "\n");
            writer.write("Ten Tac Gia: " + tenTG +"\n");
            writer.write("Nam sang tac: " + nam + "\n");
            writer.write("_________________________");
            writer.close();
            System.out.println("Da luu du lieu thanh cong");
        } catch (Exception e) {
            System.out.println("Co loi xay ra trong qua trinh ghi du lieu");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao ten tac gia: ");
        String tacgia = input.nextLine();
        System.out.println("Nhap vao ten sach: ");
        String tensach = input.nextLine();
        System.out.println("Nhap vao nam sang tac: ");
        String nam = input.nextLine();

        ghidulieu(tacgia, tensach, nam);
        input.close();
    }
}
