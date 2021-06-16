package src;

public class Circulo {

    private int radio;


    public Circulo(int radio){
        this.radio = radio;
    }


    public double calcularPerimetroC(){
        double perimetroC;
        perimetroC = 3.14 * radio * 2;
        return perimetroC;
    }

    public double calcularAreaC(){
        double areaC;
        areaC = 3.14 * radio * radio;
        return areaC;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

}