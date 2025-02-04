public class Auto {

    String marca;
    String modelo;
    Integer año;

    public Auto(String marca, String modelo, Integer año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public Auto() {
    }

    public void imprimirDatos(){
        if (marca != null) {
            System.out.println("Marca: " + marca);
        }
        if (modelo != null) {
            System.out.println("Modelo: " + modelo);
        }
        if (año != null) {
            System.out.println("Año: " + año);
        } else if (marca == null && modelo == null && año == null) {
            System.out.println("No se han inicializado los atributos del auto.");
        }
    }

    public static void main(String[] args) {

        Auto auto1 = new Auto("Toyota", "Corolla", 2023);
        Auto auto2 = new Auto("Honda", "Civic");
        Auto auto3 = new Auto("Ford");
        Auto auto4 = new Auto();

        System.out.println("Datos del Auto 1:");
        auto1.imprimirDatos();
        System.out.println("\nDatos del Auto 2:");
        auto2.imprimirDatos();
        System.out.println("\nDatos del Auto 3:");
        auto3.imprimirDatos();
        System.out.println("\nDatos del Auto 4:");
        auto4.imprimirDatos();
    }
}