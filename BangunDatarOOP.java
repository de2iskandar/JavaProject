import java.util.Scanner;

//Oleh : Dede Iskandar - 1127050031

public class BangunDatarOOP {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

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