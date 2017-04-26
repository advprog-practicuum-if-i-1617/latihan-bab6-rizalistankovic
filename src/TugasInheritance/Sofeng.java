package TugasInheritance;
//Software Engineering

public class Sofeng extends perusahaan {

    private final double tunjangan;
    private final double bonus = 300000;

    public Sofeng(double gajipokok, double bonusperbulan, int bulan, int masakerja) {
        super(gajipokok, bonusperbulan, bulan, masakerja);
        this.tunjangan = 5500000;
    }

    Sofeng() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public double getBonus() {
        return bonus;
    }

    public double getGajipokokSofeng() {
        return super.getBonusperbulan() + getTunjangan() + getBonus();
    }

    public double displayMessege1() {
        return super.getGajipokok() + getGajipokokSofeng();
    }

    boolean displayMessege1(int t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean displayMessege1(int t, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
