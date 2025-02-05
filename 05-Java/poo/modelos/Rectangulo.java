package modelos;

public class Rectangulo {

    private Double ancho;
    private Double largo;

    public Rectangulo(Double ancho, Double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public Rectangulo() {

    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double area() {
        return ancho * largo;
    }

    public Double perimetro() {
        return 2 * (largo + ancho);
    }

    public void imprimirDatos() {

        System.out.println("Ancho :" + ancho);
        System.out.println("Largo" + largo);
        System.out.println(area());
        System.out.println("Perimetro: " + perimetro());
    }
}