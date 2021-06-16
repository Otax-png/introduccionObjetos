package src;

public class Principal {
    public static void main(String[] args) {
        Principal ej = new Principal();

    }

    public Principal(){
        Contador ej1 = new Contador(4);
        Contador apunte1 = ej1;
        apunte1.setContador(20);
        System.out.println("CONTADOR");
        System.out.println("Decremento: " + ej1.decremento());
        System.out.println("Incremento: " + ej1.incremento() + "\n");

        Cuadrado ej2 = new Cuadrado(5);
        Cuadrado apunte2 = ej2;
        apunte2.setDimensionLado(8);
        System.out.println("AREA Y PERIMETRO DE UN CUADRADO");
        System.out.println("Area: " + ej2.calcularAreaCuad());
        System.out.println("Perimetro: " + ej2.calcularPerimetroCuad() + "\n");

        Circulo ej3 = new Circulo(3);
        Circulo apunte3 = ej3;
        apunte3.setRadio(15);
        System.out.println("AREA Y PERIMETRO DE UN CIRCULO");
        System.out.println("Area: " + ej3.calcularAreaC());
        System.out.println("Perimetro: " + ej3.calcularPerimetroC() + "\n");

        Rectangulo ej4 = new Rectangulo(4, 6);
        Rectangulo apunte4 = ej4;
        apunte4.setLado1(8);
        apunte4.setLado2(8);
        System.out.println("AREA Y PERIMETRO DE UN RECTANGULO");
        System.out.println("Area: " + ej4.calcularAreaR());
        System.out.println("Perimetro: " + ej4.calcularPerimetroR()+ "\n");

        Libro ej5 = new Libro(true);
        Libro apunte5 = ej5;
        apunte5.setPrestar(false);
        System.out.println("PRESTAMO Y DEVOLUCION DE LIBRO");
        System.out.println(ej5.preguntaPrestado() + "\n");

        Fraccion ej6 = new Fraccion(10, 5, 20, 4);
        Fraccion apunte6 = ej6;
        apunte6.setNumerador(21);
        apunte6.setDenominador(7);
        apunte6.setNumerador2(24);
        apunte6.setDenominador2(8);
        System.out.println("CALCULADORA");
        System.out.println("La suma de las fracciones es: " + ej6.sumarFraccion());
        System.out.println("La resta de las fracciones es: " + ej6.restarFraccion());
        System.out.println("La multiplicacion de las fracciones es: " + ej6.multiplicarFraccion());
        System.out.println("La division de las fracciones es: " + ej6.dividirFraccion() + "\n");

    }

}