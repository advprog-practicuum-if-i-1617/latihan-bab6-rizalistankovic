package TugasInheritance;
//project manager

public class Proman extends perusahaan {

    private final double tunjangan;
    private final double bonus = 450000;

    public Proman(double gajipokok, double bonusperbulan, int bulan, int masakerja) {
        super(gajipokok, bonusperbulan, bulan, masakerja);
        this.tunjangan = 6000000;
    }

    Proman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getApresiasi() {
        if (super.bulan >= 10 * 12) {
            return bonus + 250000;
        } else {
            return bonus / 2;
        }
    }

    public double getBonus() {
        return bonus;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double getGajipokokProman() {
        return super.getBonusperbulan() + getApresiasi() + getTunjangan() + getBonus();
    }

    public double displayMessege2() {
        return super.getGajipokok() + getGajipokokProman();
    }

    boolean displayMessege2(int t, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
