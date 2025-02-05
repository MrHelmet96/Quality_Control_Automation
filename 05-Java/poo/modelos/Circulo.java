package modelos;

public class Circulo {
    // Atributo privado
    private double radio;

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Constructor por defecto
    public Circulo() {
        this.radio = 0;
    }

    // Métodos getter y setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double area() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    // Método para imprimir los datos del círculo
    public void imprimirDatos() {
        System.out.println("Círculo:");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
