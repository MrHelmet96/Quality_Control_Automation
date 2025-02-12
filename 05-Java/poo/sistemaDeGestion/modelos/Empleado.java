package sistemaDeGestion.modelos;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    // getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    /*---Mostrar todos los empleados en formato tabla---*/
    public static void mostrarEmpleados(Empleado[] empleados) {
        System.out.println("\nLista de empleados:");

        // Se usa para dar formato a la salida en consola con printf, creando una tabla
        // alineada
        // %-5s s=especifica que es un String 5=Reserva 5 espacion en la salida
        // "-"=Alinea el texto a la izquierda
        System.out.printf("%-5s %-15s %-5s %-10s %-15s\n", "ID","Nombre","Edad","Salario","Departamento");
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {

                // %-10.2f .2=solo admite dos decimales despues de la coma y f se refiere al
                // tipo float
                System.out.printf("%-5d %-15s %-5d %-10.2f %-15s\n", i+1,empleados[i].getNombre(),empleados[i].getEdad(), empleados[i].getSalario(), empleados[i].getDepartamento());
            }
        }
    }


    public static Empleado[] filtrarEmpelados(Empleado[] empleados, String opcion, String input) {

        Empleado[] filtrados = new Empleado[empleados.length];
        
        int contador = 0;
        switch (opcion) {
            case "nombre":
            for (int i = 0; i < empleados.length; i++) {
                if (empleados[i].getNombre().toLowerCase().equals(input)){
                    filtrados[contador] = empleados[i];
                    contador++;
                };
            }
                break;

            case "departamento":
            for (int i = 0; i < filtrados.length; i++) {
                if (empleados[i].getDepartamento().toLowerCase().equals(input)){
                    filtrados[contador] = empleados[i];
                    contador++;
                };
            }
                break;

            }
        return filtrados;

        }
}
