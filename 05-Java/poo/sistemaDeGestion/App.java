package sistemaDeGestion;

import sistemaDeGestion.modelos.Empleado;

public class App {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[4];

        empleados[0] = new Empleado("Juan Pérez", 30, 5000, "Ventas");
        empleados[1] = new Empleado("María López", 28, 5200, "Marketing");
        empleados[2] = new Empleado("Carlos Gómez", 35, 6000, "TI");
        empleados[3] = new Empleado("Ana Martínez", 40, 6500, "Recursos Humanos");

        Empleado.mostrarEmpleados(Empleado.filtrarEmpelados(empleados, "nombre", "Juan Pérez"));
        ;
    }
}
