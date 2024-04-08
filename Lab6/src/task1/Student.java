package task1;

public class Student {
    String nume;
    double nota_lab;
    double nota_partial;
    double nota_examen;

    public Student(String nume, double nota_lab, double nota_partial, double nota_examen){
        this.nume = nume;
        this.nota_lab = nota_lab;
        this.nota_partial = nota_partial;
        this.nota_examen = nota_examen;
    }

    public double get_nota_Totala(){
        return nota_examen + nota_partial + nota_lab;
    }


    public double getNota_partial() {
        return nota_partial;
    }

    public double getMedie_note(){
        return (nota_examen + nota_lab + nota_partial) / 3.0;
    }

    public String getNume() {
        return nume;
    }

    public double getNota_lab() {
        return nota_lab;
    }

    public double getNota_examen() {
        return nota_examen;
    }
}
