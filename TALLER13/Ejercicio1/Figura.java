package Ejercicio1;

public abstract class Figura {
    private String unidades;

    public Figura(String unidades) {
        this.unidades = unidades;
    }

    public String getUnidades() {
        return unidades;
    }

    public abstract double calcularArea();
}
