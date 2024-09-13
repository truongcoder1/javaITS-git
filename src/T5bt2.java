import java.util.InputMismatchException;
import java.util.Scanner;
public class T5bt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        try {
            int so = input.nextInt();
            System.out.println("So nguyen do la : " + so);
        } catch (InputMismatchException ime) {
            System.out.println("Vui long nhap so nguyen");
        }
        finally{
            input.close();
        }
    }
}
    