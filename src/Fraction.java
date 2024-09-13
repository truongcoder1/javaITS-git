public class Fraction {
    private int tu;
    private int mau;

    public Fraction(int tu, int mau) {
        if (mau == 0) {
            System.out.println("Mau so khong the bang khong!");
        }
        this.tu = tu;
        this.mau = mau;
        rutgon();
    }

    private void rutgon() {
        int gcd = gcd(tu, mau);
        tu /= gcd;
        mau /= gcd;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }

    private int gcd(int tu, int mau) {
        if (mau == 0) {
            return tu;
        } else
            return gcd(mau, tu % mau);
    }
    public String toString(){
        return tu + "/" + mau;
    }
    public Fraction add(Fraction a){
        int tumoi = this.tu * a.mau + this.mau * a.tu;
        int maumoi = this.mau * a.mau;
        return new Fraction(tumoi, maumoi);
    }
    public Fraction subtract(Fraction a){
        int tumoi = this.tu * a.mau - this.mau *a.tu;
        int maumoi = this.mau * a.mau;
        return new Fraction(tumoi, maumoi);
    }
    public Fraction multiply(Fraction   a){
        int tumoi = this.tu * a.tu;
        int maumoi = this.mau * a.mau;
        return new Fraction(tumoi, maumoi);
    }
    public Fraction divide(Fraction a){
        if (a.tu == 0){
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
            int tumoi = this.tu * a.mau;
            int maumoi = this .mau * a.tu;
        return new Fraction(tumoi, maumoi);
    }
}
