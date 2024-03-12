package task1;

public class Patrulater {
    private int latura1, latura2, latura3, latura4;
    private double unghi1, unghi2, unghi3, unghi4;

    public Patrulater() {
        this(0, 0, 0, 0);
    }

    public int getLatura1() {
        return latura1;
    }

    public int getLatura2() {
        return latura2;
    }

    public int getLatura3() {
        return latura3;
    }

    public int getLatura4() {
        return latura4;
    }

    public double getUnghi1() {
        return unghi1;
    }

    public double getUnghi2() {
        return unghi2;
    }

    public double getUnghi3() {
        return unghi3;
    }

    public double getUnghi4() {
        return unghi4;
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }

    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this(latura1, latura2, latura3, latura4);
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }

    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }
}