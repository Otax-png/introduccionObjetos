
package src;

public class Rectangulo {

    private int lado1, lado2;
    private int perimetroR, areaR;;


    public Rectangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    public int calcularPerimetroR(){
        if (lado1 != lado2) {
            perimetroR = (2 * lado1) + (2 * lado2);
        }
        else {
            System.out.println("Inserte el 2 valores de lado diferentes");
        }
        return perimetroR;
    }

    public int calcularAreaR(){

        if (lado1 != lado2) {
            areaR = lado1 * lado2;
        }
        else {
            System.out.println("Inserte el 2 valores de lado diferentes");
        }
        return areaR;
    }


    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getPerimetroR() {
        return perimetroR;
    }

    public void setPerimetroR(int perimetroR) {
        this.perimetroR = perimetroR;
    }

    public int getAreaR() {
        return areaR;
    }

    public void setAreaR(int areaR) {
        this.areaR = areaR;
    }

}