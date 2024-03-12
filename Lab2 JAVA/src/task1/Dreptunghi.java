package task1;

public class Dreptunghi extends Paralelogram {
    public Dreptunghi(int lungime, int latime) {
        super(lungime, latime, lungime, latime, Math.toRadians(90), Math.toRadians(90), Math.toRadians(90), Math.toRadians(90));
    }

    @Override
    public double aria() {
        return getLatura1() * getLatura2();
    }
}