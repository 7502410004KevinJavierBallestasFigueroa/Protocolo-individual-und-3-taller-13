package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5, 3, "cm²");
        Triangulo triangulo1 = new Triangulo(4, 2, "m²");

        System.out.println("Área del Rectángulo:");
        System.out.println("Área: " + rectangulo1.calcularArea() + rectangulo1.getUnidades());
        System.out.println("________________________________________________");
        System.out.println("Área del Triángulo:");
        System.out.println("Área: " + triangulo1.calcularArea() + triangulo1.getUnidades());
    }
}

