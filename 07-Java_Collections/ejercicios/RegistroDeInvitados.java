// package 07-Java_Collections.ejercicios;

import java.util.HashSet;

public class RegistroDeInvitados {

    private HashSet<String> invitados;

    public RegistroDeInvitados() {
        invitados = new HashSet<>();
    }

    public void agregarInvitado(String nombre){
        invitados.add(nombre);
    }

    public void eliminarInvitado(String nombre){
        invitados.remove(nombre);
    }

    public void mostrarInvitados() {
        System.out.println("Lista de invitados:");
        if (invitados.isEmpty()) {
            System.out.println("No hay invitados en la lista.");
        }  else {
            for (String invitado : invitados) {
                System.out.println(invitado);
            }
        }
    }

}




