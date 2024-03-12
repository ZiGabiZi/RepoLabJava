package task1;

import task1.Paralelogram;

public class Romb extends Paralelogram {
    private int diag1;
    private int diag2;
    public Romb(int lungime, int diag1, int diag2,double u1,double u2){
        super(lungime,lungime,lungime,lungime,u1,u2,u1,u2);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    @Override
    public double aria() {
        return diag2 * diag1;
    }


}
