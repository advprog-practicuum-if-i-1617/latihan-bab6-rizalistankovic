package TugasInheritance;
//employee

public class perusahaan {

    public int masakerja;
    private double gajipokok = 2500000;
    private double bonusperbulan = 500000 / 2 /*bulan*/;
    int t /*tahun*/, b /*bulan*/;
    final int bulan = (t * 12) + b;

    public perusahaan(double gajipokok, double bonusperbulan, int bulan, int masakerja) {

        this.gajipokok = gajipokok;
        this.bonusperbulan = bonusperbulan;
        this.masakerja = masakerja;
    }

    perusahaan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getGajipokok(double gaji) {
        if (bulan > 5 /*tahun*/ * 12) {
            return gajipokok + getBonusperbulan();
        } else {
            return gajipokok;
        }
    }

    public double getBonusperbulan() {
        return bonusperbulan;
    }

    double getGajipokok() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
