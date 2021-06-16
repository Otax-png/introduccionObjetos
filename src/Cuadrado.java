package src;

public class Cuadrado {


    private int dimensionLado;

    public Cuadrado(int dimensionLado){
        this.dimensionLado = dimensionLado;
    }


    public int calcularPerimetroCuad(){
        int perimetro;
        perimetro = dimensionLado * 4;
        return perimetro;
    }

    public int calcularAreaCuad(){
        int area;
        area = dimensionLado * dimensionLado;
        return area;
    }


    public int getDimensionLado() {
        return dimensionLado;
    }

    public void setDimensionLado(int dimensionLado) {
        this.dimensionLado = dimensionLado;
    }


}