public class NumerosAleatorios {
    public static void main(String[] args) {
        
    }

    public static Integer numeroAleatorioEnRango(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("El primer parametro debe ser menor al segundo");
        } else {
            int numeroAleatorio = (int) (Math.random() * (max - min) + min);
            return numeroAleatorio;
        }
    }
}
