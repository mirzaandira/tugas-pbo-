public class Segitiga extends BangunDatar{
    protected double alas;
    protected double tinggi;
    protected double sisiA;
    protected double sisiB;
    protected double sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        hitungLuas();
        hitungKeliling();
    }
    public void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }

    public void hitungKeliling() {
        keliling = sisiA + sisiB + sisiC;

    }
public class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        super(alas, tinggi, sisiA, sisiB, sisiC);
        setNama("Segitiga Sembarang");
    }
}

public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        super(alas, tinggi, sisiA, sisiB, sisiC);
        setNama("Segitiga Siku-Siku");
    }
}

public class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double alas, double tinggi, double sisiA, double sisiB) {
        super(alas, tinggi, sisiA, sisiB, sisiB); 
        setNama("Segitiga Sama Kaki");
    }
}

public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double alas, double tinggi, double sisi) {
        super(alas, tinggi, sisi, sisi, sisi); 
        setNama("Segitiga Sama Sisi");
    }
}


    }
