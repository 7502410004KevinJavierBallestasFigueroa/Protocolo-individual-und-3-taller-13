package Ejercicio2;

public class Pato implements Nadador, Volador{
    private String nombre;
    private String color;

    public Pato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void volar(){
        System.out.println("El pato "+getNombre()+" de color "+getColor()+" puede volar");
    }
    @Override
    public void nadar(){
        System.out.println("El pato "+getNombre()+" de color "+getColor()+" puede nadar");
    }

}
