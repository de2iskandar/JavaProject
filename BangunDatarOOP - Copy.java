import java.util.Scanner;

//Oleh : Dede Iskandar - 1127050031

public class BangunDatarOOP {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        PersegiPanjang pp = new PersegiPanjang(4, 5);
        System.out.println("\nPersegi Panjang\n----------------------");
        System.out.print("Masukan Panjang : ");
        int p = sc.nextInt();
        pp.setPanjang(p);
        System.out.print("Masukan Lebar : ");
        int l = sc.nextInt();
        pp.setLebar(l);

        System.out.println("Luas : " + pp.CariLuas());
        System.out.println("Keliling : " + pp.CariKeliling());

        BujurSangkar bs = new BujurSangkar(3);
        System.out.println("\nBujur Sangkar\n----------------------");
        System.out.print("Masukan Sisi : ");
        int s = sc.nextInt();
        bs.setSisi(s);

        System.out.println("Luas : " + bs.CariLuas());
        System.out.println("Keliling : " + bs.CariKeliling());
        

        System.out.println("\nSegitiga\n----------------------");
        SegiTiga st = new SegiTiga(2, 3);
        System.out.print("Masukan Alas : ");
        int a = sc.nextInt();
        st.setAlas(a);
        System.out.print("Masukan Tingi : ");
        int t = sc.nextInt();
        st.setTinggi(t);
        
        System.out.println("Luas : " + st.CariLuas());
        System.out.println("Keliling : " + st.CariKeliling());
    }
}

abstract class BangunDatar {
    abstract double CariLuas();
    abstract double CariKeliling();
}

class PersegiPanjang extends BangunDatar {
    private int lebar;
    private int panjang;

    public void setPanjang (int panjang){
        this.panjang=panjang;
    }

    public void setLebar (int lebar){
        this.lebar=lebar;
    }

    public int getPanjang(){
        return panjang;
    }

    public int getLebar(){
        return lebar;
    }

    PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    double CariLuas() {
        return panjang * lebar;
    }

    double CariKeliling() {
        return 2 * (panjang + lebar);
    }
}

class BujurSangkar extends BangunDatar {
    private int sisi;

    public void setSisi (int sisi){
        this.sisi=sisi;
    }

    public int getSisi(){
        return sisi;
    }

    BujurSangkar (int s) {
        sisi = s;
        //Jika s kurang dari atau sama dengan 0,
        //throw exception di sini
    }

    double CariLuas() {
        return sisi * sisi;
    }

    double CariKeliling() {
        return 4 * sisi;
    }
}

class SegiTiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public void setAlas (int alas){
        this.alas=alas;
    }

    public void setTinggi (int tinggi){
        this.tinggi=tinggi;
    }

    public int getAlas(){
        return alas;
    }

    public int getTinggi(){
        return tinggi;
    }

    SegiTiga (int a, int t) {
        alas = a;
        tinggi = t;
        //Jika s kurang dari atau sama dengan 0,
        //throw exception di sini
    }

    double CariLuas() {
        return 0.5*alas*tinggi;
    }

    double CariKeliling() {
        return 3 * alas;
    }
}