public class T6bt2 {
    public static void main(String[] args) {
        Fraction phanso1 = new Fraction(2, 3);
        Fraction phanso2 = new Fraction(1, 4);

        Fraction cong = phanso1.add(phanso2);
        Fraction tru = phanso1.subtract(phanso2);
        Fraction nhan = phanso1.multiply(phanso2);
        Fraction chia = phanso1.divide(phanso2);

        System.out.println(phanso1 + " + " + phanso2 + " = " + cong);
        System.out.println(phanso1 + " - " + phanso2 + " = " + tru);
        System.out.println(phanso1 + " x " + phanso2 + " = " + nhan);
        System.out.println(phanso1 + " / " + phanso2 + " = " + chia);
    }
}
