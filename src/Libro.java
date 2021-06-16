package src;

public class Libro {

    private boolean prestar;

    public Libro(boolean prestar){
        this.prestar = prestar;
    }

    public boolean prestamo(){
        prestar = true;
        return prestar;
    }

    public boolean devolucion(){
        prestar = false;
        return prestar;
    }

    public String preguntaPrestado(){
        if (prestar = true) {
            return "EL libro se ha prestado";
        }

        else    {
            return "El libro se ha devuelto";
        }

    }

    public boolean getPrestar() {
        return prestar;
    }

    public void setPrestar(boolean prestar) {
        this.prestar = prestar;
    }

}