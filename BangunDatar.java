public class RecomendedSampleOOP {
  public static void main(String[] args) {
        // TODO code application logic here
        BujurSangkar bs = new BujurSangkar(8);
        System.out.println("Luas bs dengan sisi 8 = " + bs.CariLuas());
        
        PersegiPanjang pp = new PersegiPanjang(5, 2);
        System.out.println("Luas pp dengan p = 5 dan l = 2 adalah " + pp.CariLuas());

        //Contoh polimorfisme
        BangunDatar bd = new BujurSangkar(8);
        System.out.println("Luas bangun datar dengan sisi 8 = " + bs.CariLuas());
        
        bd = new PersegiPanjang(5, 2);
        System.out.println("Luas bangun datar dengan p = 5 dan l = 2 adalah " + pp.CariLuas());        
    }
}

abstract class BangunDatar {
    abstract double CariLuas();
    abstract double CariKeliling();
}

class PersegiPanjang extends BangunDatar {
    private int lebar = 1;
    private int panjang = 1;

    PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
        //Jika p dan l kurang dari atau sama dengan 0,
        //throw exception di sini
    }

    double CariLuas() {
        return panjang * lebar;
    }

    double CariKeliling() {
        return 2 * (panjang + lebar);
    }
}

class BujurSangkar extends BangunDatar {
    private int sisi = 1;

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
    private int alas = 3;
    private int tinggi = 4

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